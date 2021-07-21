package com.ust.examples;

public class Exception4 {
	
	public static void main(String[] args) {
		try {
			int arr[]= {1,2,3,4,5};
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The specified index does not exist"+"in array.please correct the error.");
		}
		

	}

}
