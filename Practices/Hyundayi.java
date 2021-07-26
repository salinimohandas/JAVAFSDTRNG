package com.ust.examples;
//Abstract class
abstract class Car{
	// Car is a super class
	int x;
	abstract void insuranceDetails();
	void display() {
		
	}
	
	
	
}




// Hyundayi is sub_class
public class Hyundayi extends Car{
	
	void insuranceDetails() {
		System.out.println("please provide insurance details ");
	}

	public static  void main(String[] args) {
	//	Car c = new Car();
		Hyundayi h = new Hyundayi();
		Car c = new Hyundayi();
		
		c.insuranceDetails();
		h.insuranceDetails();
	}

}
