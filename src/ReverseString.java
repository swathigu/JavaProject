/*Write a program to reverse a string.
 * Donot use StringBuffer/StringBuilder inbuilt reverse function.
 * 
 */
import java.util.Scanner;


public class ReverseString {

	private static Scanner in;

	public static void main(String[] args) {
		String str = new String();
		 in = new Scanner(System.in);
		System.out.println("Enter a string :");
		str = in.nextLine();
		String str2 = new String();
		for (int i=str.length()-1;i>=0;i--){
			str2 += str.charAt(i);
		}
		System.out.println("Reverse String "+ str2);

	}

}
