/*
 * Write a program to print 1 to 10 numbers without using loops 
 * and you should not have more than 1 print statement
 */
public class PrintNumbers {

	public static void main(String[] args) {
		print(1);

	}

	private static void print(int i) {
		if(i<=10){
			System.out.println(i);
			print(i+1);
		}
		
	}

}
