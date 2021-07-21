package com.ust.examples;
/*
 * Example of inner class
 * 
 */

public class Example40 {
	private int x=5;
	
	void display() {
		System.out.println("Outer class");
	}
	
	private class Inner{
		int y;
		Inner(int y){
			this.y=y;
		}
		void display()
		{
			System.out.println("Example of inner class");
			
		}
	}

	public static void main(String[] args) {
	
		Example40.Inner e1 = new Example40().new Inner(8);
        e1.display();
        Example40 e2 = new Example40();
        e2.x=5;
        System.out.println(e2.x);
        e2.display();
	}

}
