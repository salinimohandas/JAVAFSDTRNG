package com.ust.examples;
//Abstract examples

 abstract class Bank_Name{
	 abstract int getInterestRate();
	
}
class HDFC extends Bank_Name{
	int getInterestRate() {
		return 10;
	}
}

class ICICI extends Bank_Name{
	int getInterestRate() {
		return 8;

}
}


 class TestBank {

	public static void main(String[] args) {
		Bank_Name b = new HDFC();
		System.out.println(b.getInterestRate());
		
		Bank_Name b1 = new ICICI();
		System.out.println(b1.getInterestRate());
		
	}
	}


