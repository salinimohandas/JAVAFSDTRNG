package com.ust.examples;

import java.util.ArrayList;
import java.util.Collections;

public class Collection1 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(2);
		a.add(4.4f);
		a.add("hi");
		a.remove(1);
		
		System.out.println(a);
		a.add(2, "ghvh");
		System.out.println(a);
		
		ArrayList<Integer>x=new ArrayList<Integer>();
		//Arraylist collection type integer wrapper class  and generic involved
		x.add(4);
		x.add(10);
		x.add(1);
		x.add(0);
		Collections.sort(x);;
		System.out.println(x);
		
		 x.remove(1);
		x.add(1,3);
		//x.set(x.indexOf(2),9);
		System.out.println(x);
	}

}
