import java.util.ArrayList;

/*
 * Write a program to copy arraylist to an array.
 */
public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Oracle");
		al.add("ExpressJS");
		al.add("NodeJS");
		al.add("JavaScript");
		al.add("MongoDB");
		
		String arr[] = new String[al.size()];
		   arr = al.toArray(arr);
		   
		for(String a: arr){
			System.out.println(a);
		}
	}

}
