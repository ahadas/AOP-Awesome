package base;


public class ReaderThread extends BufferClientThread {

	public ReaderThread(BoundedStack shared) {
		super(shared);
	}

	public ReaderThread(BoundedStack shared, int ops) {
		super(shared, ops);
	}

	protected void accessBuffer() {
		shared.pop();
	}

}
