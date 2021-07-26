package com.ust.examples;

import java.util.PriorityQueue;

public class Examples54 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);
		
		System.out.println(pQueue.peek());
		System.out.println(pQueue.poll());
		System.out.println(pQueue.peek());
		
	}

}
