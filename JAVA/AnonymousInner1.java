package com.ust.examples;

abstract class Person{
	abstract void eat();
}

public class AnonymousInner1{

	public static void main(String[] args) {
		Person p = new Person() {
			void eat() {System.out.println("Nice Fruits");}
		};
		p.eat();
	}

}
