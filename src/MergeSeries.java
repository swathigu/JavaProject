/*
 * Write a program which takes an input series as a1,a2,a3....an,b1,b2,b3...bn 
 * and produces output as a1,b1,a2,b2,a3,b3.......,an,bn.
 */

public class MergeSeries {

	public static void main(String[] args) {
		String str ="a1,a2,a3,a4,a5,b1,b2,b3,b4,b5";
		String newStr = null;
		String[] spliStr = str.split(",");
		int mid = spliStr.length/2;
		int i=0,j=mid;
		while(i<mid || j<spliStr.length-1){
			if(newStr==null){
				newStr = spliStr[i]+spliStr[j];
			}else{
				newStr += spliStr[i]+spliStr[j];
			}
			i++;
			j++;
		}
		System.out.println("New String: "+ newStr);
	}

}
