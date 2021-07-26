package com.ust.examples;
//Interface

interface Ani{
	
	public void animalSound();// interface method(does not have a body)
	
	public void sleep();
	
}

//pig"implements" the animal interface

class Pig implements Ani{
	public void animalSound() {
		
		//the body of animalSound() is provided here
		System.out.println("The Pig says:wee wee");
	}
	
	public void sleep() {
		
		//the body of sleep() is provided here
		System.out.println("Zzz");
	}
}
 class Interface1 {

	public static void main(String[] args) {
		
		Pig myPig = new Pig(); //create a pig object
		
		myPig.animalSound();
		myPig.sleep();

	}

}
