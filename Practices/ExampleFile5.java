package com.ust.examples;

import java.io.File;

public class ExampleFile5 {

	public static void main(String[] args) {
		
		File file = new File("D:Text1.txt");
		
		try {
			file.createNewFile();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		File newFile = new File("D:newfile1.txt");
		
		boolean value = file.renameTo(newFile);
		
		if(value) {
			System.out.println("The name of the file is changed.");
		}
		else
		{
			System.out.println("The name cannot be changed");
		}
	}

}
