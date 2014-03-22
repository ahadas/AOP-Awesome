package base;


import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		// name of the file where to print the results
		// by default prints to System.out
		System.out.println("===================test start====================>");
		// name of the compiler: one of "ajc", "coolc", "ajcoolc",
		// "ajcomp", "coolcomp", "ajcoolcomp".
		// The second and the third compilers are ``virtual''.
		// if compiler is "coolc" or "ajcoolc" then the buffer is created
		// by instantiating BoundedStackAdvisedWithCoolC, otherwise,
		// instance of BoundedStack is created.
		// If not specified, exception is thrown
		String compiler = getCommanLineParamVal("compiler", args);
		int bufferSize = 10;
		BoundedStack stack = new BoundedStack(bufferSize);
		testStack(stack, args);
	}
	
	public static void testStack(BoundedStack stack, String[] args) {
		// valid values are: aj_correctness, cool_correctness, and runningtime
		//default is runningtime
		String mode = "cool_correctness";

		// number of threads to run (default is 1)
		String threadsNumStr = getCommanLineParamVal("threadsNum", args);
		int threadsNum = getIntegerValue(threadsNumStr, 1);

		// number of operations to run (default is 1)
		String opsNumStr = getCommanLineParamVal("opsNum", args);
		int opsNum = getIntegerValue(opsNumStr, 1);

		// number of tests to run (default is 1)
		String testsNumStr = getCommanLineParamVal("testsNum", args);
		int testsNum = getIntegerValue(testsNumStr, 1);
		String compiler = getCommanLineParamVal("compiler", args);

		if (mode.equals("aj_correctness")) {
			//logToFile aspect prints results into the file
			runMultipleThreads(stack, threadsNum, opsNum);
		} else if (mode.equals("cool_correctness")) {
			if (isBufferSynchronized(stack))
				System.out.println("The stack is properly synchronized.");
			else
				System.out.println("The stack is NOT synchronized!");			
		} else {
			long[] runningTimes = estimateRunningTime(stack, testsNum, threadsNum, opsNum);
			printRunningTimes(runningTimes);
		}		
		printFooter(mode, compiler, testsNum, threadsNum, opsNum);		
	}
	
	static void printFooter(String mode, String compiler, int testsNum, int threadsNum, int ops) {
		System.out.println("<===================test completed====================");
		System.out.println("Compiler: "+compiler+", verifying: "+mode);
		System.out.println("  testsNum="+testsNum+", threadsNum="+threadsNum+", push and pop ops in per test/thread="+ops);
		System.out.println("\n");
	}

	static void printRunningTimes(long[] results) {
		System.out.println(" Running time for a thread: average: "+ results[0]+ ", min: " + results[1]+", max: " + results[2]);
	}

	/**
	 * To be run with platform.jar, ajonly.jar, coolonly.jar, ajcool.jar, and
	 * ajc Estimates how much time in average it takes for one thread to run
	 * <code>ops</code> push and pop operations by running
	 * <code>testsNum</code> number of tests. Should be used to compare
	 * efficiency of our weavers to standard weavers.
	 * 
	 * @author kojarski
	 * 
	 */
	public static long[] estimateRunningTime(BoundedStack stack, int testsNum, int threadsNum,
			int ops) {
		long[] result = new long[threadsNum];
		long minTime = -1;
		long maxTime = -1;
		long average = 0;
		for (int i = 0; i < testsNum; i++) {
			long[] testResult = runMultipleThreads(stack, threadsNum, ops);
			for (int j = 0; j < threadsNum; j++) {
				result[j] = result[j] + testResult[j];
				if (minTime == -1 || testResult[j] < minTime)
					minTime = testResult[j];
				if (maxTime < testResult[j])
					maxTime = testResult[j];
			}
		}
		for (int i = 0; i < threadsNum; i++)
			average = average + result[i];
		average = average / (threadsNum * testsNum);
		return new long[] { average, minTime, maxTime };
	}

	static long runSingleThread(BoundedStack stack, int ops) {
		return runMultipleThreads(stack, 1, ops)[0];
	}

	/**
	 * The method calculates running times of multiple concurrent threads that
	 * are accessing the same buffer. It creates <code>threadsNum</code>
	 * number of <code>WriterReaderThread</code> threads, and applies them
	 * simultaneously at the same buffer. Each thread invokes
	 * <code>ops</ops> number 
	 *  of <code>push</code> and <code>pop</code> operations at the buffer.
	 *  The method returns     
	 * @param threadsNum number of WriterReaderThread threads 
	 * @param ops  number of operations for each thread to execute
	 * @return
	 */
	static long[] runMultipleThreads(BoundedStack buff, int threadsNum, int ops) {
		System.out.println("arik runMultipleThreads");
		long[] result = new long[threadsNum];
		WriterThread[] threads = new WriterThread[threadsNum];
		for (int i = 0; i < threadsNum; i++)
			threads[i] = new WriterThread(buff, ops);
		try {
			BufferClientThread.startThreads(threads);
			waitForThreadsToStop(threads);
			for (int i = 0; i < threadsNum; i++)
				result[i] = threads[i].getRunningTime();
		} catch (Exception e) {
		}
		return result;
	}

	/**
	 * Tests whether the buffer is synchronized. Used to test correctness of
	 * COOL compilers (std and ours).
	 * 
	 * @return
	 */
	public static boolean isBufferSynchronized(BoundedStack buff) {
		BufferClientThread[] threads = new BufferClientThread[4];
		threads[0] = new ReaderThread(buff);
		threads[1] = new ReaderThread(buff);
		threads[2] = new ReaderThread(buff);
		threads[3] = new WriterThread(buff);

		try {
			System.out.println("starting threads");
			BufferClientThread.startThreads(threads);
		} catch (Exception e) {
			System.out.println("Exception while starting threads:"
					+ e.getMessage());
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println("stopping..");
		stopThreadsAndWait(threads);
		System.out.println("stopped!");
		for (int i = 0; i < threads.length; i++)
			if (threads[i].caughtException)
				return false;
		return true;
	}

	static void stopThreadsAndWait(BufferClientThread[] threads) {
		while (BufferClientThread.isAlive(threads)) {
			try {
				BufferClientThread.stopThreads(threads);
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}

	static void waitForThreadsToStop(BufferClientThread[] threads) {
		while (BufferClientThread.isAlive(threads)) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}
	}

	public static String getCommanLineParamVal(String paramName, String[] args) {
		paramName = "-" + paramName;
		for (int i = 0; i < args.length; i++)
			if (args[i].equals(paramName))
				return args[i + 1];
		return null;
	}

	static PrintStream getOutputStream(String fileName) {
		try {
			if (fileName != null) {
				FileOutputStream fout = new FileOutputStream(fileName, true);
				return new PrintStream(fout);
			}
		} catch (Exception e) {
		}
		return System.out;
	}

	static int getIntegerValue(String valStr, int defaultVal) {
		try {
			return Integer.parseInt(valStr);
		} catch (Exception e) {
		}
		return defaultVal;
	}
}
