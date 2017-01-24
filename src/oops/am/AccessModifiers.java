package oops.am;

public class AccessModifiers {
	
	private String s1;
	String s2;
	public String s3;
	protected String s4;
	
	 public AccessModifiers(){
		s1 = "String1";
		s2 = "String2";
		s3 = "String3";
		s4 = "String4";
	}
	 private AccessModifiers(String s1,String s2,String s3,String s4){
			this.s1 = s1;
			this.s2 = s2;
			this.s3 = s3;
			this.s4 = s4;
		}
	private void method1(){
		System.out.println("Form Private Method");
	}
	void method2(){
		System.out.println("Form default Method");
	}
	public void method3(){
		System.out.println("Form public Method");
	}
	protected static void method4(){
		System.out.println("Form protected Method");
	}
}
