package com.ust.examples;

class One{
	public void print_geek()
	{
		System.out.println("Greeks");
	
	
	}
}

class Two extends One{
	
	public void print_for() {System.out.println("for");}
}

//Driver Class

public class Practice1 {

	public static void main(String[] args) {

		Two g=new Two();
		g.print_geek();
		g.print_for();
		g.print_geek();
	}

}

// java program ti illustrate the concept of
// Hierarchial inheritance

class A{
	
	public void print_A()
	{
		System.out.println("Class A");}
}
class B extends A{
	
	public void print_B()
	{
		System.out.println("Class B");
	}
	
}
class C extends A{
	
	public void print_C()
	{
		System.out.println("Class C");
	}
	
}
class D extends A{
	
	public void print_D()
	{
		System.out.println("Class D");
	}
	
}


		

		
		
	
	
