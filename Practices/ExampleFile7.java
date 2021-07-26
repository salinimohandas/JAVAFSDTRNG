package com.ust.examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * BufferReaderwriterExample
 * 
 */

public class ExampleFile7 {

	public static void main(String[] args) {
		
		File file = new File("D:file1.txt");
		FileWriter fWriter = null;
		BufferedWriter bWriter = null;
		
		try {
			fWriter = new FileWriter(file);
			bWriter = new BufferedWriter(fWriter);
			bWriter.write("\n This is an example \n");
			bWriter.write("of using BufferWriter and \n");
			bWriter.write("BufferReader.");
			bWriter.flush();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}		
		finally {
			try {
				if(fWriter!=null) {
					fWriter.close();
				}
				if(bWriter!=null) {
					bWriter.close();
				}
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		FileReader fReader = null;
		BufferedReader bReader = null;
		
		try {
			fReader = new FileReader(file);
			bReader = new BufferedReader(fReader);
			
			String line = null;
			
			while((line=bReader.readLine())!=null) {
				System.out.println(line);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fReader!=null) {
					fReader.close();
				}
				if(bReader!=null) {
					bReader.close();
				}
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
			}
		}
		