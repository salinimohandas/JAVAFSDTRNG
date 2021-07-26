package com.ust.examples;

public class Base1 {
	
	final void foo(int i) {}// overloading is allowed 
	void foo(int i, String s) {}
}
class Child extends Base1{
	@Override void foo(int i, String s) {}
	//@Override//void foo(int i){}
	
}
	

