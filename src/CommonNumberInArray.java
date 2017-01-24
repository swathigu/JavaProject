import java.util.Vector;

/*
 * Write a program to find the common number in any given two arrays.
 */
public class CommonNumberInArray {
	public static void main(String[] args ){
		int[] x={1,2,55,3,44,5};
		int[] y={1,2,3,4,55};
		Vector temp =new Vector();
		for (int i=0; i<x.length;i++){
			for(int j=0;j<y.length;j++){
				if(x[i]==y[j]){
					temp.add(x[i]);
				}
			}
		}
		System.out.print("Common Numbers in both arrays are ");
		for(int i=0; i<temp.size();i++){
			if(i == temp.size()-1){
			System.out.print(temp.get(i));
			}else{
				System.out.print(temp.get(i)+ ",");
			}
		}
	}

}
