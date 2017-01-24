import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferedReaderInput {

	public static void main(String[] args) {
		//Buffered Reader Examples
				BufferedReader br = null;
				System.out.println("Enter two numbers to subtract");
				try {
					br = new BufferedReader(new InputStreamReader(System.in));
					int a = Integer.parseInt(br.readLine());
					int b = Integer.parseInt(br.readLine());
					System.out.println("Difference of "+a+" and "+b+" is "+(a-b));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (NumberFormatException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
				    try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

	}

}
