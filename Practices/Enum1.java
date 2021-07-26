package com.ust.examples;

public class Enum1 {
	
	enum Level1{
		LOW,MEDIUM,HIGH;
	}

	public static void main(String[] args) {
	
	//Level1 myVar =Level1.MEDIUM;
	System.out.println(Level1.values());
	for(Level1 l:Level1.values()) {
		System.out.println(l.name());
	}

	}

}
