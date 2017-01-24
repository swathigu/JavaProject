import java.util.Scanner;

/*    	f. Write a program  to check an armstrong number i.e. 
 * whether the if we power up the each individual number to the 
 * total number of digits in the number and add them it should be equal to the number itself.
 *  For example 153 has 3 digits in it and if we do 1^3+5^3+3^3=153.
 FYI: ^ means is to the power.
 */
public class Armstrong {

	public static void main(String[] args) {
		System.out.println("Enter any Number: ");
		int n = new Scanner(System.in).nextInt();
		int temp, digits = 0, sum = 0;
		temp = n;
		while (temp != 0) {
			digits++;
			temp = temp / 10;
		}
		temp = n;
		while (temp != 0) {
			int rem = temp % 10;
			sum = sum + power(rem, digits);
			temp = temp / 10;
		}

		if (sum == n)
			System.out.println("Given number is Armstrong number");
		else
			System.out.println("Given number is not Armstrong number");

	}

	private static int power(int rem, int digits) {
		int temp = 1;
		for (int i = 1; i <= digits; i++)
			temp = rem * temp;
		return temp;
	}
}
