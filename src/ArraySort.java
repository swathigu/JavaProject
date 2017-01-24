
public class ArraySort {

	public static void main(String[] args) {
	int a[] ={2,5,4,6,10,45,23,46757,2324,0,232};
	int temp;
	for (int i = 0; i < a.length - 1; i++) {
	    for (int j = 0; j < a.length - 1 -i; j++) {
	        if (a[j + 1] < a[j]) {
	            temp = a[j];
	            a[j] = a[j + 1];
	            a[j + 1] = temp;
	        }
	    }
	}

		for (int i=0;i<a.length;i++){
			System.out.println(a[i]+ ",");
		}
	}

}
