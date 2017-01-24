/*. Write a program which accepts a string like "This is nice" 
 * and converts it to a string like "This1 is2 nice3".
 */

import java.util.Scanner;


public class WordSplittingNumbers {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = in.nextLine();
		String[] splitStr = str.split(" ");
		String newStr = new String();
		for (int i=0;i<splitStr.length;i++){
			newStr+=splitStr[i]+(i+1)+" ";
		}
		System.out.println("new String :"+ newStr);
	}
}
