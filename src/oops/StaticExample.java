package oops;

public class StaticExample {

	/*Static variables are also known as Class Variables.
	Such variables get default values based on the data type.
	Data stored in static variables is common for all the objects( or instances ) of that Class.*/
	
	static int num;
	static String mystr;
	
	/*Static block is mostly used for changing the default values of static variables.
	 * This block gets executed when the class is loaded in the memory.*/
	
	static{
	      num = 97;
	      mystr = "Static keyword in Java";
	   }
	
	/*A Class can be made static only if it is a nested Class. 
	 * The nested static class can be accessed without having an object of outer class.*/
	static class X{
	      static String str="Inside Class X";
	  }
	
	
	static void display1(){
		System.out.println("display1() static method");
	}
	void display2(){
		System.out.println("display2 method");
	}
	
	public static void main(String[] args) {
		
		//static variable
		System.out.println("Value of num="+num);
	    System.out.println("Value of mystr="+mystr);
	     
	    //static inner class
		X.str="Inside Class Example1";
	     System.out.println("String stored in str is- "+ X.str);
	     
	     
	     //calling static method
	     display1();
	     
	     //calling non-static method
	     StaticExample obj = new StaticExample();
	     obj.display2();
	}

}
