/*
 * Write a program that is expected to throw a null pointer exception 
 * and in turn handles it using try catch and finally.
 */
public class TryCatchFially {

	public static void main(String[] args) {
		String s=null;
		try {
			s.length();
		} catch (NullPointerException e) {
			System.out.println("Null Ponter exceptions");
			e.printStackTrace();
		}finally{
			System.out.println("From finally block");
		}

	}

}
