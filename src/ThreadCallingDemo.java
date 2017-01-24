
public class ThreadCallingDemo {

	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo("Thread1");
		td.start();
		ThreadDemo td1 = new ThreadDemo("Thread2");
		td1.start();
		ThreadDemo td2 = new ThreadDemo("Thread3");
		td2.start();
	}

}
