/* Write a program to find the missing number in a series of sorted numbers stored in an array.
 * 
 */

public class MissingNumberArray {

	public static void main(String[] args) {
		int[] num={11,12,13,14,15,17,19,21,23};
		int temp;
		for(int i=0;i<num.length-1;i++){
			temp = num[i+1];
			if (num[i]+1== temp){
				
			}else{
				System.out.println("missing number is "+ (temp-1));
			}
		}

	}

}
