/*
 *  Write a program having different methods to perform below operations.
  	--> To create an arraylist and add elements to it.
	--> To search for an element in the list.
  	--> To print the elements of the list using iterator.
  	--> To print the elements in the reverse order using ListIterator.

 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;


public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> ar = new  ArrayList<String>();
		
		//adding elements
		
		ar.add("Oracle");
		ar.add("Java");
		ar.add("c");
		ar.add("J2ee");
		
		//Searching element
		System.out.println("Enter element to search");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Element found: "+ ar.contains(str));
		
		//Printing elements
		
		Iterator<String> i = ar.iterator();
		System.out.println("Printing ArrayList Elements");
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		ListIterator<String> li = ar.listIterator(ar.size());
		System.out.println("Printing ArrayList Elements in Reverse Order");
		while(li.hasPrevious()){
			System.out.println(li.previous());
		}
	}

}
