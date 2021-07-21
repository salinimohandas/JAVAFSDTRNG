package com.ust.examples;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;

public class ExamoleFile9 {

	public static void main(String[] args) throws IOException {
		
		char[] buff= new char[1024];
		StringWriter sw = new StringWriter();
		FileInputStream fis = null;
		BufferedReader bReader = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\ustjava02\\fg.txt");
			
			bReader = new BufferedReader(new InputStreamReader(fis, "UTF=8"));
			int n;
			
			while((n=bReader.read(buff))!=-1)
			{
				sw.write(buff,0,n);
			}
			System.out.println(sw.toString());
			
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		finally {
			sw.close();
			bReader.close();
		}
		

	}

}
