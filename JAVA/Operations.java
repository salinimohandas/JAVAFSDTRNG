package com.ust.examples;

public enum Operations {
	PLUS,
	MINUS,
	TIMES,
	DIVIDE;
	
	double calculate(double x,double y) {
		switch(this) {
		case PLUS:
			return  x+y;
		case MINUS:
			return  x-y;
		case TIMES:
			return  x*y;
		case DIVIDE:
			return  x/y;
			
			default:
				throw new AssertionError("Unkown operations"+this);
		}
	}
}
