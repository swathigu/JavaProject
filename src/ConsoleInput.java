import java.io.Console;


public class ConsoleInput {

	public static void main(String[] args) {
		System.out.println("Enter 2 numbers");
		Console console = System.console();
		int a = Integer.parseInt(console.readLine());
		int b = Integer.parseInt(console.readLine());
		System.out.println("Division of "+a+" and "+b+" is "+(a/b));
	}

}
