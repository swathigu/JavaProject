
public class SplitArray {

	public static void main(String[] args) {
		int a[] ={1,1,1,1,1,1,1,1,1,1};
		int len = a.length;
		int a1 = 0,a2=0;
		for(int i=0,j=len/2;i<len/2 &&j<=a.length;i++,j++){
			a1 += a[i];
			a2 += a[j];
		}
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1+a2);
	}

}
