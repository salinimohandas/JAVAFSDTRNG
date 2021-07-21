package com.ust.examples;

import java.io.File;

public class ExampleFile6 {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\ustjava02");
		String[] fList = f.list();
		
		for(String str : fList) {
			System.out.println(str);
		}
	}

}
