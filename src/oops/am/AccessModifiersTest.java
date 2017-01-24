package oops.am;


public class AccessModifiersTest {

	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();
		
		/*AccessModifiers1 am1 = new AccessModifiers1();
		am1.msg();
		 since AccessModifiers1 class is default access and in different 
		 package it gives compile error*/
		
		/*
		 * AccessModifiers am1 = new AccessModifiers("a","b","c","d");
		 * Gives compile error
		 * am.s1 and am.method1() gives compiletime error
		*/
		
		//The private access modifier is accessible only within class.

		//If you don't use any modifier, it is treated as default bydefault. The default modifier is accessible only within package.

		//The protected access modifier is accessible within package and outside the package but through inheritance only.
        //The protected access modifier can be applied on the data member, method and constructor. It can't be applied on the class.
		
		//The public access modifier is accessible everywhere. It has the widest scope among all other modifiers.
		
		System.out.println("Displaying default class variable "+am.s2);
		System.out.println("Displaying public class variable "+am.s3);
		System.out.println("Displaying protected class variable "+am.s4);
		am.method2();
		am.method3();
		am.method4();
	}

}
