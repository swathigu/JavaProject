/*
 * Write a program to check for a palindrome string.like 12121
 */
import java.util.Scanner;


public class Palindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = in.nextLine();
		int len = str.length();

		int cnt =0;
		for(int i=0,j=len-1;i<=j;i++,j--){
			if(str.charAt(i)!=str.charAt(j)){
				cnt++;
				System.out.println("Not a palindrome");
				break;
			}
		}
		if(cnt==0){
			System.out.println("Palindrome");
		}
	}
}
