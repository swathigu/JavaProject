/*
 * Write a program containing a function which is expected to throw any kind of exception 
 * say NullPointerException or ArithmeticException etc and then handle this function in 
 * the parent function which calls this function.
 */
public class ExceptionHandling {

	public static void main(String[] args) {
		try{
			divide(15,0);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("next statement after exception");
	}

	private static int divide(int i,int j) throws ArithmeticException{
		
		return i/j;
	}

}
