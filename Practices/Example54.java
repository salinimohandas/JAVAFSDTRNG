package com.ust.examples;

import java.util.HashSet;
import java.util.Iterator;

public class Example54 {

	public static void main(String[] args) {
	HashSet<String> hs = new HashSet<String>();
	
	hs.add("Geeks");
	hs.add("For");
	hs.add("Geeks");
	hs.add("Is");
	hs.add("Very Helpful");
	
	Iterator<String> itr = hs.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	}

}
