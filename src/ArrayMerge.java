import org.apache.commons.lang3.ArrayUtils;


public class ArrayMerge {

	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 5 };
		int[] b = {1, 2, 6, 7 };
		int[] c = ArrayUtils.addAll(a, b);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
