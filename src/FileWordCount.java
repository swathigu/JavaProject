import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileWordCount {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("/Users/Swathi/Documents/workspace/Test/src/sample.txt"));
			String line = br.readLine();
			int count = 0;
		       while (line != null) {
		    	   count += line.split(" ").length;
		          line = br.readLine();
		       }         
		       System.out.println("Number of words in the file " +count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}