import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Write a program to search for a string in a file and then return the count of number of occurrences of the string.
 */
public class StringOccurenceCount {

	public static void main(String[] args) {
		try {
			System.out.println("Enter Search String :");
			Scanner sc = new Scanner(System.in);
			String searchStr = sc.nextLine();
			BufferedReader br = new BufferedReader(new FileReader("/Users/Swathi/Documents/workspace/Test/src/sample1.txt"));
			String line = br.readLine();
			int count = 0;
		       while (line != null) {
		    	   String[] splitLine = line.split(" ");
		    	   for(int i=0;i<splitLine.length;i++){
		    		   if(searchStr.equals(splitLine[i])){
		    			   count++;
		    		   }
		    	   }
		          line = br.readLine();
		       }         
		       System.out.println("Number of occurences in the file " +count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
