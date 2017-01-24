import java.util.Scanner;

/*
 * Write a program to perform a linear search on any given array.
 * Linear search is the basic search where you look for the element to be searched in a sequential way.
 */
public class ArraySearchLinear {

	public static void main(String[] args) {
    int[] x = {5,3,2,4,54,56,23,12};
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number to search: ");
    int n = in.nextInt();
    int cnt =0;
    for(int i=0; i<x.length; i++){
    	if(x[i] ==n){
    		cnt++;
    		System.out.println("Element found at position " + i);
    	}
    }

    if(cnt ==0){
		System.out.println("Element not found ");
	}
	}

}
