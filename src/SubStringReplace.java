import java.util.Scanner;

public class SubStringReplace {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = in.nextLine();
		System.out.println("Enter a start and end index :");
		int beginIndex = in.nextInt();
		int endIndex = in.nextInt();
		String substr= str.substring(beginIndex, endIndex);
		System.out.println("Substr "+ substr);
		System.out.println("Enter a string to replace:");
		String replstr= in.nextLine();
		str.replace(substr, replstr);
		System.out.println(str);
	}

}
