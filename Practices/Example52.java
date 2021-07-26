package com.ust.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example52 {

	public static void main(String[] args) {
		
		List list=Arrays.asList("One Two Three Four Five six One Three Four".split(" "));
		System.out.println("List: "+list);
		
		List sublist = Arrays.asList("Three Four".split(" "));
		System.out.println("SubList :"+sublist);
		System.out.println("IndexOfSublist: "+Collections.lastIndexOfSubList(list,sublist));
		

	}

}
