package com.ust.examples;

import java.io.StringWriter;

public class ExampleFile9 {

	public static void main(String[] args) {
		
		String str1 ="Hello World!";
		String str2="\nThis is StringReader program.";
		StringWriter outputWriter = new StringWriter();
		
		outputWriter.write(str1,0,5);
		
		System.out.println(outputWriter.toString());
		StringBuffer sbuf = outputWriter.getBuffer();
		sbuf.append(str2);
		System.out.println(outputWriter.toString());
		
	}

}
