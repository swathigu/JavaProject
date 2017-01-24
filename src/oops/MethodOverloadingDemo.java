package oops;

public class MethodOverloadingDemo {
	
	public int add(int a,int b){
		return a+b;
	}
	
	public int add(int a,int b,int c){
		return a+b+c;
	}

	public static void main(String[] args) {
		MethodOverloadingDemo md = new MethodOverloadingDemo();
		System.out.println(md.add(2,3));
		System.out.println(md.add(2,3,4));
	}

}
