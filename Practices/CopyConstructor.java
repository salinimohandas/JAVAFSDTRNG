package com.ust.examples;

public class CopyConstructor {
	String web;

    CopyConstructor(String w){
		web=w;
	}
	CopyConstructor(CopyConstructor cc){
	web=cc.web;
	}
	void disp()
	{
		System.out.println("Constructor:"+web);
	}
	public static void main(String args[]) {
		CopyConstructor obj1 = new CopyConstructor("Example of copy constructor in java");
		CopyConstructor obj2 = new CopyConstructor(obj1);
		obj1.disp();
		obj2.disp();
		
		
	}
	}

