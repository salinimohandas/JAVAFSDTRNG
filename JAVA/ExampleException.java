package com.ust.examples;
/*
 * 
 * 
 */

public class ExampleException {

	public static void main(String[] args) {
	String s =null;
	//int x=5/0;
	
	try {
		try {
		System.out.println(s.length());
	}
		catch(NullPointerException e) {
			e.printStackTrace();
		}finally{
			System.out.println("This code gets executed always");
			
		}
		int a[] = new int[5];
		a[6]=10;
		}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Occured");
	e.printStackTrace();

}
	}

}
