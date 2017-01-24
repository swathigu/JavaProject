public class SwapTwoInSortedArray {

	public static void main(String[] args) {
		int[] a = { 10,12, 13, 16, 15, 14 };

		for (int i = a.length - 1; i > 0; i--) {

			if (a[i] < a[i - 1]) {
				int j = i - 1;
				while (j >= 0 && a[i] < a[j])
					j--;
				int temp = a[i];
				a[i] = a[j + 1];
				a[j + 1] = temp;
				break;
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
