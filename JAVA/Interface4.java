package com.ust.examples;

interface Poly{
	void getArea(int length, int breadth);
	
}
class Rectangle1 implements Poly
{
	public void getArea(int length,int breadth)
	{
		System.out.println("The area of rectangle is "+(length*breadth));
	}
}
class Square1 implements Poly

{
	public void getArea(int length,int breadth)
	{
		System.out.println("The area of Square is  "+(length*length));
	}
}	
class Tri1 implements Poly

{
	public void getArea(int length,int breadth)
	{
		System.out.println("The area of Triangle is  "+(0.5*length*breadth));
	}
}	




 class Interface4 {
public static void main(String[] args) {
		
		Rectangle1 r=new Rectangle1();
		r.getArea(5,6);
		Square1 s=new Square1();
		s.getArea(4,0);
		Tri1 t =new Tri1();
		t.getArea(4,4);
}

}
