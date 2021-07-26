package com.ust.examples;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExampleFile1 {

	public static void main(String[] args) {
		try {
			
		File fName = new File("D:Text2.txt");
		
		//fName.write("Iam writing to the file");
		
		if(fName.createNewFile()) {
			System.out.println("File is created");
			
		}
		else
		{
			System.out.println("File is already exist");
		}
		System.out.println(fName.canRead());
		System.out.println(fName.canWrite());
		System.err.println("Error is Found");
		Scanner s =new Scanner(System.in);
		String txt = s.nextLine();
		System.out.println(txt);
		
		fName.setReadable(false);
		fName.setWritable(false);
		fName.setWritable(false, false);
		//fName.close();
		
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
	}

}
