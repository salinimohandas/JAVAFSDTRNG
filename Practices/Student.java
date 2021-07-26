package com.ust.examples;


 public class Student {
	String name;
	int id;
	
	Student(String name,int id)
	{
		this.name = name;
		this.id = id;
	}
	
 public class ParameterizedConstructor{
	 
 }
	

	public static void main(String[] args) {

		Student s1=new Student("Ashok",560);
		System.out.println("Student Name:  "+s1.name+" and Student id: "+s1.id);
	}
 }


