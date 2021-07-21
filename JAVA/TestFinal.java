package com.ust.examples;
//Final examples

   class Vehicle1{
	int x=5;
	Vehicle1(){
		System.out.println("Vehicles class constructor");
	}
	
	
	final void changeGear() {
	
			System.out.println("Automatic variant");
	}
}
class Honda1 extends Vehicle1{
	
	{
		System.out.println("Vehicle running successfully");
	
	}
	void changeGear1() {
		
		System.out.println("Automatic variant in subclass");
		super.changeGear();
}
}


public class TestFinal {
	public static void main(String[] args) {
Vehicle1 v =new Honda1();
System.out.println(v.x);
Honda1 h = new Honda1();
v.changeGear();
h.changeGear1();
	}

}
