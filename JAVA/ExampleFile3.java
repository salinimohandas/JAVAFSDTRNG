package com.ust.examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExampleFile3 {

	public static void main(String[] args) {
		try {
			/*FileInputStream input = new FileInputStream("C:\\Users\\ustjava02\\Input.txt");
			
			int i = input.read();
			
			while(i!=-1) 
			{
				System.out.println((char)i);
				i=input.read();
			}*/
			//input.close();
			String s= "Output file";
			FileOutputStream output=new FileOutputStream("C:\\Users\\ustjava02\\input.txt");
			
			output.write(s.getBytes());
			output.close();
		}
		catch(Exception e) 
		
		{
			e.getStackTrace();
		}

	}

}
