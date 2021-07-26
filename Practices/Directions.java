package com.ust.examples;

public enum Directions {

	EAST("E"),
	WEST("W"),
	NORTH("N"),
	SOUTH("S")
	;

private final String shortCode;

Directions(String code){
	this.shortCode = code;
}
public String getDirectionCode() {
	return this.shortCode;
}
}

 class EnumDemo2 {

	public static void main(String[] args) {
		
		Directions dir = Directions.SOUTH;
		System.out.println(dir.getDirectionCode());
		Directions dir1 = Directions.SOUTH;
		System.out.println(dir1.getDirectionCode());

	}

}


