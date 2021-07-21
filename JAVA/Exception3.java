package com.ust.examples;

public class Exception3 {

	public static void main(String[] args) {
		try {
			System.out.println("Inside Block1");
			int b=45/0;
			System.out.println(b);
		}
		catch(ArithmeticException e1) {
			System.out.println("Exception: e1");
		}
		try {
		System.out.println("Inside Block2");
			int b=45/0;
			System.out.println(b);
			}
		catch(ArrayIndexOutOfBoundsException e2){
			System.out.println("Exception e2");
		}
		System.out.println("Just other statment");
		
	
		try {
			System.out.println("Inside Block2");
				int b=45/0;
				System.out.println(b);
				}
	catch(ArithmeticException e3) {
		System.out.println("Arithmetic Exception");
		System.out.println("Inside parent try catch block");
				
	}
	catch(ArrayIndexOutOfBoundsException e4) {
		System.out.println(" ArrayIndexOutOfBoundsException");
		System.out.println("Inside parent try catch block");
	
}
	catch(Exception e5) {
		System.out.println(" Exception");
		System.out.println("Inside parent try catch block");
	}
	System.out.println("Next Statement...");
}
}

