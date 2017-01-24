import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Write a program to search for a string in a file and then return the count of number of occurrences of the string.
 */
public class ReplaceStringOccurence {

	public static void main(String[] args) {
		try {
			System.out.println("Enter Search String :");
			Scanner sc = new Scanner(System.in);
			String searchStr = sc.nextLine();
			System.out.println("Enter String to replace:");
			String replStr = sc.nextLine();
			

			File file = new File("/Users/Swathi/Documents/workspace/Test/src/sample1.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "", oldtext = "";
            while((line = reader.readLine()) != null)
                {
                oldtext += line + "\r\n";
            }
            reader.close();
          String newtext = oldtext.replaceAll(searchStr, replStr);
           
            FileWriter writer = new FileWriter("/Users/Swathi/Documents/workspace/Test/src/sample1.txt");
            writer.write(newtext);writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
