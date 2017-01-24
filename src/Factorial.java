import java.util.Scanner;

/*Write a program  to calculate factorial of a given number. 
 * You need to compute the factorial with one logic that uses recursion and another logic without recursion.
*/
public class Factorial {
	private static Scanner in;
	public static void main(String[] args) {

		int x;
	     System.out.println("Enter x :");
	     in = new Scanner(System.in);
	     x = in.nextInt();
		System.out.println(factwithRecursion(x));
		System.out.println(factwithoutRecursion(x));
	}
	
	 private static int factwithoutRecursion(int x) {
		 int temp=1;
		 for (int i=0;i<x; i++){
			 temp = temp *(x-i);
		 }
			 
		return temp;
	}

	static int factwithRecursion(int x){
		if (x == 0)
            return 1;
    else
            return x * factwithRecursion(x-1);

	}

}
