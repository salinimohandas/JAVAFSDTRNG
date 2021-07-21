package com.ust.examples;
class Example60{
	public static void main(String[] args)
	{
		System.out.println("This is a bouded type generics class.");
		}
	
	}


class GenericClass<T extends String>{
	public void display() 
	{
		GenericsClass<String> obj=new GenericsClass<String>("");
		
		}
	
}
