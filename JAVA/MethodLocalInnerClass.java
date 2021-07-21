package com.ust.examples;

public class MethodLocalInnerClass{
	void outerMethod() {
		System.out.println("inside OuterMethod");
		class Inner{
			void innerMethod() {
				System.out.println("inside innermethod ");
			}
		}
		Inner y = new Inner();
		y.innerMethod();
	}

	public static void main(String[] args) {
		
		MethodLocalInnerClass outer = new MethodLocalInnerClass();
		outer.outerMethod();

	}

}
