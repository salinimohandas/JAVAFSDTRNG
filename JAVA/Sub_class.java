package com.ust.examples;

class Super_class{
	int n=20;
	
	public void display()
	{
		System.out.println("This is display methd of superclass");
	}
}

public class Sub_class extends Super_class{
	int n=10;
	
	public void display()
	{
	
	System.out.println("This is display methd of subclass");
	
}

public void  my_method() {

	  Sub_class sub= new Sub_class();
		 sub.display();
		 super.display();
		 
		 
		 System.out.println(" Value of the variable named n in sub class: "+sub.n);
		 System.out.println("Value of the variable named n in super class: "+super.n);
	}
		public static void main(String args[]) {
		Sub_class obj = new Sub_class();
			obj.my_method();
}
}

	
