package com.ust.lambda;

public class Java8Tester {

	public static void main(String[] args) {
		Java8Tester tester = new Java8Tester();
		
		MathOperation addition = (int a,int b) -> a + b;
		
		MathOperation subtraction = (a,b) -> a-b;
		
		MathOperation multiplication = (int a, int b) -> {return a * b;};
		
		MathOperation division = (int a, int b) -> a / b;
		
		System.out.println("10 + 5 = " +tester.operation(10, 5,addition));
		
		System.out.println("10 - 5 = " +tester.operation(10, 5,subtraction));
		
		System.out.println("10 * 5 = " +tester.operation(10, 5,multiplication));
		
		System.out.println("10 / 5 = " +tester.operation(10, 5,division));
		
		GreetingService  greetServicel = message ->
		System.out.println("Hello "+ message);
		
		GreetingService  greetService2 = (message) ->
		System.out.println("Hello "+ message);
		
		greetServicel.sayMessage("Abhinav");
		greetService2.sayMessage("Abhii");
		
	
	}
	
interface MathOperation {
	int operation(int a,int b);
}

interface GreetingService {
	void sayMessage(String message);
}
private int operation(int a,int b, MathOperation mathOperation) {
	return mathOperation.operation(a, b);
	
}
}
