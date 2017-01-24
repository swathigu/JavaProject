package oops;

public class MethodOverridingDemo extends Class1{

	public void disp(){
	      System.out.println("disp() method of Child class");
	   }
	   public void xyz(){
	      System.out.println("xyz() method of Child class");
	   }
	   
	public static void main(String[] args) {
		
		Class1 obj = new MethodOverridingDemo();
	      obj.disp();
	      obj.abc();
	}

}
