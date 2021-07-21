package com.ust.examples;

abstract class Animal1{
	abstract void makeSound();
}

class Puppy extends Animal1{
	public void makeSound(){
		System.out.println("Bark bark.");
	}
}

class Cat extends Animal1{
	public void makeSound(){
		System.out.println("Meow Meow.");
	}
}

public class Main1 {

	public static void main(String[] args) {
		Puppy d1 = new Puppy();
		d1.makeSound();
		
		Cat c1= new Cat();
		c1.makeSound();
	
	}

}
