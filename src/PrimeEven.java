/*Write a program  to check if a given number is prime or not
 * 
 */
import java.util.Scanner;


public class PrimeEven {

	public static void main(String[] args) {

		 System.out.println("Enter number: ");
	     int number = new Scanner(System.in).nextInt();
	     
	     for(int i=2;i<number;i++){
	    	 if(number%i == 0){
                 System.out.println("even");
                 break;
	    	 }
	     }
	     System.out.println("odd");

	}

}
