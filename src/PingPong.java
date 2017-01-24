/*Write a program print "ping" if a number is divisible by 3,"pong" 
 * if a number is divisible by 5, and "ping pong" 
 * if number is divisible by both, else print the number.
 * 
 */
import java.util.Scanner;


public class PingPong {

	public static void main(String[] args) {

		 System.out.println("Enter number: ");
	        int number = new Scanner(System.in).nextInt();
	        if(number%3==0 && number%5==0){
	        	System.out.println("pingpong");
	        }else if(number%5==0){
	        	System.out.println("pong");
	        }else if(number%3==0){
	        	System.out.println("ping");

	        }else{
	        	System.out.println(number);
	        }
	
	}

}
