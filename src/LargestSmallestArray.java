
public class LargestSmallestArray {

	public static void main(String[] args) {
		int[] a= {10,12,5,4,2,50,234,-3,3,45};
		int max=0,min=a[0];
		for(int i=1; i<a.length; i++){
			if (a[i] > max)
			 max = a[i];
			if(a[i]<min)
				min = a[i];
		}
		System.out.println("max "+max);
		System.out.println("min "+min);
	}

}
