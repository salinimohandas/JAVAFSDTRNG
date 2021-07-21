package com.ust.examples;

import java.util.LinkedHashMap;

public class AddElementsToLinkedHashMap {

	public static void main(String[] args) {

		LinkedHashMap<Integer,String>hml =new LinkedHashMap<Integer,String>();
		
		hml.put(3,"Geeks");
		hml.put(2,"For");
		hml.put(1,"Geeks");
		
		System.out.println("Mapping of LinkedHashMap :"+hml);
		
	}

}
