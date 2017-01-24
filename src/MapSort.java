import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * Write a program to sort a map by value.
 */
public class MapSort {

	public static void main(String[] args) {

		// sort by keys
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(5, "Dublin");
		hmap.put(2, "Pleasaton");
		hmap.put(3, "San Ramon");
		hmap.put(4, "Fremont");
		hmap.put(1, "Mountain House");

		System.out.println("Before Sorting:");
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry me = (Map.Entry) iterator.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
		System.out.println("After Sorting:");
		Set set2 = map.entrySet();
		Iterator iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry me2 = (Map.Entry) iterator2.next();
			System.out.print(me2.getKey() + ": ");
			System.out.println(me2.getValue());
		}

		// sort by values

		Map<String, Integer> aMap = new HashMap<String, Integer>();

		// adding keys and values
		aMap.put("Five", 5);
		aMap.put("Seven", 7);
		aMap.put("Eight", 8);
		aMap.put("One", 1);
		aMap.put("Two", 2);
		aMap.put("Three", 3);

		Set<Entry<String, Integer>> mapEntries = aMap.entrySet();

		System.out.println("Values and Keys before sorting ");
		for (Entry<String, Integer> entry : mapEntries) {
			System.out.println(entry.getValue() + " - " + entry.getKey());
		}

		// used linked list to sort, because insertion of elements in linked
		// list is faster than an array list.
		List<Entry<String, Integer>> aList = new LinkedList<Entry<String, Integer>>(
				mapEntries);

		// sorting the List
		Collections.sort(aList, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> ele1,
					Entry<String, Integer> ele2) {

				return ele1.getValue().compareTo(ele2.getValue());
			}
		});

		// Storing the list into Linked HashMap to preserve the order of
		// insertion.
		Map<String, Integer> aMap2 = new LinkedHashMap<String, Integer>();
		for (Entry<String, Integer> entry : aList) {
			aMap2.put(entry.getKey(), entry.getValue());
		}

		// printing values after soring of map
		System.out.println("Value " + " - " + "Key");
		for (Entry<String, Integer> entry : aMap2.entrySet()) {
			System.out.println(entry.getValue() + " - " + entry.getKey());
		}

	}

}
