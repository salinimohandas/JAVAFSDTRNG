package com.ust.examples;

import java.util.Iterator;
import java.util.TreeSet;

public class Example55 {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Greeks");
		ts.add("For");
		ts.add("Greeks");
		ts.add("Is");
		ts.add("Very Helpful");

		Iterator<String> itr = ts.iterator();
	
	while(itr.hasNext())
{
		System.out.println(itr.next());	
}

}
}