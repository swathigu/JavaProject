/*    	h. Write a program  that prints a pattern like below.
    		*
    		**
    		***
    		****
    		*****
    		******

 */

import java.util.Scanner;


public class ASeries {

	public static void main(String[] args) {
		
		 System.out.println("Enter number of lines to print: ");
	        int number = new Scanner(System.in).nextInt();
	        
	        for(int i=0;i<number;i++){
	        	for(int j=0;j<=i;j++){
	        		System.out.print("*");
	        	}
	        	System.out.println();
	        }
	}

}
