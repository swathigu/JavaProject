import java.util.HashMap;
import java.util.Scanner;

/*
 *  Write a program having below methods.
  	--> To create a hashmap.
	--> To search for a key in the created map and then returns its value.
 */
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "apple");
		map.put(2, "grapes");
		map.put(3, "banana");
		map.put(4, "orange");
		System.out.println("Enter Key to search: ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		if(map.get(key)!=null){
			System.out.println("value is " + map.get(key));
		}else{
			System.out.println("key not found");
		}
	}

}
