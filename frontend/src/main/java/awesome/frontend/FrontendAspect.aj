package awesome.frontend;
import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.aspectj.ajdt.ajc.ConfigParser;

public abstract aspect FrontendAspect {

	private File outputDir;

	pointcut isSourceFile(String filename): call(boolean ConfigParser.isSourceFileName(String)) && args(filename);

	boolean around(String filename): isSourceFile(filename) {
//		System.out.println("calling isSourceFileName with: " + filename);
		return isSourceForThisMechanism(filename) ? true : proceed(filename);
	}

	pointcut addFile(File file): call(void ConfigParser.addFile(File)) && args(file);

	void around(File file): addFile(file) {
//		System.out.println("got: " + file.getName());
		try {
			proceed(isSourceForThisMechanism(file.getName()) ? convert2java(file) : file);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return;
		}
	}

	pointcut parseCommandLine(String[] args): call(void ConfigParser.parseCommandLine(String[])) && args(args);

	void around(String[] originalArgs): parseCommandLine(originalArgs) {
		int indexOfInpath = indexOfInPath(originalArgs);
		if (indexOfInpath < 0) {
			int length = originalArgs.length + 2;
			String[] args = new String[length];
			System.arraycopy(originalArgs, 0, args, 0, length-2);
			args[length-2] = "-inpath";
			args[length-1] = new StringBuilder()
			.append(".")
			.append(File.pathSeparator)
			.append(getOutputDir().getAbsolutePath())
			.toString();
			proceed(args);
		}
		else {
			if (indexOfInpath + 1 < originalArgs.length) {
				originalArgs[indexOfInpath + 1] = new StringBuilder(originalArgs[indexOfInpath + 1])
				.append(File.pathSeparator)
				.append(getOutputDir().getAbsolutePath())
				.toString();
			}
			proceed(originalArgs);
		}
	}

	private int indexOfInPath(String[] args) {
		for (int i=0; i<args.length; ++i)
			if ("-inpath".equals(args[i]))
				return i;
		return -1;
	}

	protected File getOutputDir() {
		if (outputDir == null) {
			final File defaultTempDir = FileUtils.getTempDirectory();
			try {
				outputDir = File.createTempFile("awesome", "", defaultTempDir);
				if (outputDir.exists()) {
					FileUtils.forceDelete(outputDir);
				}
				FileUtils.forceMkdir(outputDir);
				FileUtils.forceDeleteOnExit(outputDir);
			}
			catch (Exception ex) {
				ex.printStackTrace();
				outputDir = defaultTempDir;
			}
		}
		return outputDir;
	}

	protected boolean isSourceForThisMechanism(String filename) {
		for (String postfix : postfix())
			if (filename.endsWith(postfix))
				return true;
		return false;
	}

	abstract protected List<String> postfix();
	abstract protected File convert2java(File input) throws Exception;
}
