package com.ust.examples;
/*
 * 
 * 
 */

 class Eg4 {

	public static void main(String[] args) {
		int[] numbers= {2,-5,0,5,12,-25,33,9,8,12};
		int sum = 0;
		double average;
		
		//access all elements using for each loop
		//add each elements in sum
		for (int number:numbers) {
			sum+=number;
		}
		
		//get the total number of elements
		int arrayLength= numbers.length;
		
		//calculate the average
		//convert the average from int to double
		
		average=((double)sum/(double)arrayLength);
		
		System.out.println("Sum= "+sum);
		System.out.println("average= "+average);
	}
				
						
		
		
			
		}
		
	

