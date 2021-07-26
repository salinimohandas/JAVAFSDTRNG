package com.ust.examples;

public class ArrayAverage {

	public static void main(String[] args) {
		
		double array[]= {10,20,30,40,50};
		double sum= 0.0;
		double average = 0.0;
		
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
			
		}
		average=sum/array.length;
		System.out.println("Average: "+average);
			
	}

}
