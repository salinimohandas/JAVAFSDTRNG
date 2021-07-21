package com.ust.examples;

class Student1
{
	int roll;
	void getData(int p)
	{
		roll = p;
	}
	void Display()
	{
		System.out.println("Roll no is:"+roll);
	}
	}

class Test extends Student1
{
	double p1,p2;
	void PutMarks(double x,double y)
	{
		p1=x;
		this.p2=y;
	}
	void showMarks()
	{
		System.out.println("Test1= "+p1);
		System.out.println("Test1= "+p1);
	}
	}
interface Sports{
	
	double weight=50.0;
	public void ShowWeight();
}
	
	class Results extends Test implements Sports
	{
	double total;
	public void ShowWeight()
	{
System.out.println("Weight="+weight);	
		
	}
	void DisplayAll()
	{
		total = p1+p2+weight;
		Display();
		showMarks();
		ShowWeight();
		System.out.println("The total is : "+total);
	}
	}


public class Interface3
{

	public static void main(String[] args) {
		Results res = new Results();
		res.getData(101);
		res.PutMarks(55.5,77.8);
		res.DisplayAll();
		
	}
}

