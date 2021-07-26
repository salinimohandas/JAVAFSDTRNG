package com.ust.examples;

class Base{
	final void display()
	{
		System.out.println("Base method called");
	}
}
class Derived extends Base
{
	void display1()//override
	{
		System.out.println("Base method");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		Derived d=new Derived();
		
		d.display();
		Derived d1=new Derived();
		d1.display1();
		
	}
		
	}

