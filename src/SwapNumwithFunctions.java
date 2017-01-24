/*		  c. Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
     		   --> One Function should swap the numbers without any third new variable.
      		 --> Second function should swap the numbers using a third variable.
*/
import java.util.Scanner;


public class SwapNumwithFunctions {

	private static Scanner in;

	public static void main(String[] a){
		int x, y;
	      System.out.println("Enter x and y");
	      in = new Scanner(System.in);
	 
	      x = in.nextInt();
	      y = in.nextInt();
	      swapNumberswithTemp(x,y);
	      swapNumberswithoutTemp(x,y);
	}

	private static void swapNumberswithoutTemp(int x, int y) {
		System.out.println("swapNumberswithoutTemp function Before Swapping\nx = "+x+"\ny = "+y);
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("swapNumberswithoutTemp function After Swapping\nx = "+x+"\ny = "+y);
		
	}

	private static void swapNumberswithTemp(int x, int y) {
		System.out.println("swapNumberswithTemp function Before Swapping\nx = "+x+"\ny = "+y);
        x = x + y;
        y = x - y;
        x = x - y;
		System.out.println("swapNumberswithTemp function After Swapping\nx = "+x+"\ny = "+y);		
	}
}
