package com.ust.examples;
/*
 * 
 * example for loops
 */

public class Example3 {

	public static void main(String[] args)
	{
		//String[] str=new String[5];
		
		String[] str= {"alona","sanju","sarmada","arya","anjali"};
		
		for(int i=0;i<str.length;i++) {
			
			if(str[i].equals("arya"))
				//break;
				continue;
			System.out.println(str[i]);
		}
	}
}
