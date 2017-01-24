/*Write a program  that accepts input from the command line and then prints them*/

public class CmdLineInputProgram {

	public static void main(String[] args) {
		for (int i=0; i<args.length;i++){
			System.out.println(args[i]);
		}
	}
}
