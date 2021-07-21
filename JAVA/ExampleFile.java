package com.ust.examples;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExampleFile {

	public static void main(String[] args) {
		try {
		
		FileWriter f=new FileWriter("D:File1.txt");
		
		/*if(f.createNewFile()) {
			System.out.println(f.getName()+"is created");
		}
		else
		{
			System.out.println("Already Exist");
		}*/
		f.write("This is a java training");
		
		f.close();
	
	}
	catch(IOException e) {
		System.out.println("exception ocurred");
		}
	}
}
