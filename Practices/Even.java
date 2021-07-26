package com.ust.examples;
import java.util.Scanner;
/*
 * Even and Odd Number
 * 
 */

 class Even {

	public static void main(String[] args) {
		
		int n;
		
		System.out.println("enter an integer");
		
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		
		
			if(n%2==0)
			{
				System.out.println("number is even");
			}
			else
			{
				System.out.println("Number is odd");
			}
			
		
	

	}

}
