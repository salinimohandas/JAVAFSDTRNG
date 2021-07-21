package com.ust.examples;

class Calculation{
	int z;
	
	public void addition(int x,int y) {
		z=x+y;
		System.out.println("The sum of the given numbers: "+z);
	}
	public void substraction(int x,int y) {
		z=x-y;
		System.out.println("The subsraction of the given numbers: "+z);
		
	}
}

public class Calc extends Calculation {
	
	public void multiplication(int x, int y) {
		z=x*y;
		System.out.println("The product of the given numbers: "+z);
	}

	public static void main(String[] args) {
		int a=20, b=10;
		Calc demo = new Calc();
		demo.addition(a, b);
		demo.substraction(a, b);
		demo.multiplication(a, b);
		
		
		

	}

}
