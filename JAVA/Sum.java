package com.ust.examples;

abstract class Sum {
	/*
	 *These two are abstract methods, the child class
	 * must implement these methods 
	 */
	
	public abstract int sumOfTwo(int n1,int n2);
    public abstract int sumOfThree(int n1,int n2,int n3);
	
    //Regular Method
	public void disp() {
		System.out.println("Method of class sum");
	}
}
//Regular class extends abstract class
class Demo extends Sum{
	
	/*if I don't provide the implementation of these 
	 * two methods, the program throw compilation error.
	 */
	
	public int sumOfTwo(int a,int b) {
	return a+b;
	}
	
	public int sumOfThree(int a,int b,int c) {
		return a+b+c;
		}


	public static void main(String args[]) {
		
		Sum obj = new Demo();
		System.out.println(obj.sumOfTwo(3,7));
		System.out.println(obj.sumOfThree(4,3,19));
		obj.disp();
		
		

	}

}
