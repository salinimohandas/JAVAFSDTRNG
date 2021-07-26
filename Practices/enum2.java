package com.ust.examples;



public class enum2 {
	public enum Directions{
		EAST,
		WEST,
		NORTH,
		SOUTH

	}
	
	
	public static void main(String[] args) {
		
		Directions dir = Directions.NORTH;
		if(dir==Directions.EAST) {
			System.out.println("Direction: EAST");
		}
		else if(dir==Directions.WEST) {
			System.out.println("Direction: 	WEST");
		}
		else if(dir==Directions.NORTH) {
			System.out.println("Direction: 	NORTH");
			
		}
		else  {
			System.out.println("Direction: 	SOUTH");
			
		}

	}

}
