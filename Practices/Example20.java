package com.ust.examples;
/*
 * 
 * constructor
 */

public class Example20 {
	
	
	
	
int x;
float y;
String z;

Example20(){}
Example20(int x, float y){
	this.x=x;
	this.y=y;
}

Example20(int a, float b,String c)
{
	//x=a;
	//y=b;
	z=c;
}


     public static void main(String[] args) {
		Example20 e1= new Example20();
		System.out.println(e1.x);
		Example20 e2= new Example20(2,3.0f);
		System.out.println(e2.y);
		Example20 e3= new Example20(2,3.0f,"Hello");
		System.out.println(e3.x);
		System.out.println(e3.y);
		System.out.println(e3.z);
		
		
		
	}

}
