package com.ust.examples;

class Animal{
	
	String name;
	public void eat() {
		System.out.println("I can eat");
	}
}

//inherit from Animal
class Dog extends Animal{
	
	//new methos in sub class
	public void display() 
	{
		System.out.println("My name is "+name);
	}
}

 class Main {

	public static void main(String[] args) {
		
		//create an object of the subclass
		Dog labrador = new Dog();
		
		//access field of superclass
		labrador.name= "Roby";
		labrador.display();
		labrador.eat();

	}

}
