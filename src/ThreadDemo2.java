
public class ThreadDemo2 extends Thread{
	private Thread t;
	private String threadName;
	
	public ThreadDemo2(String threadName) {
		this.threadName = threadName;
	}
	
	public void run(){
		System.out.println("My thread is in running state." + threadName);  
	}

	public static void main(String args[]){  
		ThreadDemo2 obj=new ThreadDemo2("Thread1");   
	     obj.start();  
	     obj.s
	  }  
}
