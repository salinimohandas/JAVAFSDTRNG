package com.ust.examples;
/*
 * About string
 *  
 */

public class Example10 {

	public static void main(String[] args) {
		String str ="hello";
		
       String str1 = "hello";	
       
str="hi";

System.out.println(str);
System.out.println(str.concat(str1));


System.out.println(str.charAt(1));

//System.out.println(str.compareTo(str1));

//System.out.println(str1.indexOf(1));

System.out.println(str1.length());


System.out.println(str1.substring(3));

System.out.println(str.trim());

System.out.println(str.valueOf(false));

System.out.println(str.isEmpty());

System.out.println(str.join(str1,"World ", " abc "," xyz"));







	}

}
