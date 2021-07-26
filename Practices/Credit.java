package com.ust.examples;


 class CreditCards {
	private String cardName;//instance variable
	private String expiryDate;
	private float creditBalance;
	
	CreditCards(){
		cardName="salini";
		expiryDate="1/3/20";
		creditBalance=5000;
		
	}
	
	void CheckCardBalance() {
		
		if(creditBalance>=40000)
		{
			System.out.print("sufficient balance");
		}
		else {
			System.out.print("not much");
			
		}
	}
void makePayment() {}
 }

class Visa extends CreditCards{
	
	float interestRate;
	float cardlimits;
	
	//Visa(String x, int y, float z){
	Visa(){	
	super();
	}
	
	void checkDiscounts()
	{
		System.out.print("many discounts will be provided");
	}
}

class Mastercards extends CreditCards{
	
	void checkPaymentsOption()
	{
		System.out.print("online payments mode is available");
	}
}
public class Credit{
	
  public static void main(String[] args) {
		//Visa v = new Visa("salini","1234",450.00f);
	  Visa v = new Visa();
		v.CheckCardBalance();
  }
	}


