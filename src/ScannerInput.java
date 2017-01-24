import java.util.Scanner;


public class ScannerInput {

	public static void main(String[] args) {
		
		//Scanner Input
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two integers x and y: ");
		int x =in.nextInt();
		int y=in.nextInt();
		System.out.println("Sum of "+x+" and "+y+" is "+(x+y));

	}

}
