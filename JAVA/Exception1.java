package com.ust.examples;

public class Exception1 {
	
	public static void main(String[] args) {
		try {
			int divideByZero=5/0;
			
			int array[]= {4,12,6,8,9};
			System.out.println(array[8]);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmaticExceptin=> "+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("ArrayIndexOutOfBoundsException=> "+e1.getMessage());
		}
		
		finally{
			System.out.println("This is the finally block");
		}
	}

}
