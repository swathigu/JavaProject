/*Write a program to reverse each individual word in a sentence.*/

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = in.nextLine();
		String[] splitStr = str.split(" ");
		String newStr = new String();
		
		for (int i=0;i<splitStr.length;i++){
			String str2 = new String();
			for (int j=splitStr[i].length()-1;j>=0;j--){
				str2 += splitStr[i].charAt(j);
			}
			newStr+=str2+" ";
		}
		System.out.println("new String :"+ newStr);

	}

}
