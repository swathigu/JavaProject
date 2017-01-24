/*
 * . Write a program to find duplicates in an array using set.
 */
import java.util.HashSet;
import java.util.Iterator;


public class ArrayDuplicate {

	public static <E> void main(String[] args) {
		String[] str ={"a","b","c","d","a","b","c"};
		HashSet<String> set = new HashSet<String>();
		for (String arrayElement : str)
        {
            if(!set.add(arrayElement))
            {
                System.out.println("Duplicate Element is : "+arrayElement);
            }
        }
		
		str = set.toArray(new String[set.size()]);
		for(int i=0;i<str.length;i++){
			System.out.println(str[i]);
		}
	}

}
