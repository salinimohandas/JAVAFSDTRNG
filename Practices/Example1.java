package com.ust.examples;
/*this example depicts the usage
 *  of local static and instance variable
  */

public class Example1 {
	 String name;//instance variable
     double price;//instance variable
	 static int count;//static variable
     
	

	public static void main(String[] args) {
				int age=10;//local variables
		System.out.println(age);
		Example1 e=new Example1();
		e.name="abhi";
		e.price=6.0;
		count=6;
		System.out.println(e.name);
		System.out.println(e.price);
		System.out.println(count);


	}

}
