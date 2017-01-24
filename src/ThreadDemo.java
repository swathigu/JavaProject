public class ThreadDemo implements Runnable {

	private Thread t;
	private String threadName;

	ThreadDemo(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		System.out.println("Thread " + threadName + " Started");

		try {
			for (int i = 0; i < 5; i++) {
				t.sleep(10000000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void start() {
		if (t == null) {
			System.out.println("Creating Thread " + threadName);
			t = new Thread(this, threadName);
			t.start();
		}
	}

}


