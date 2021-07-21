package com.ust.examples;



 class Bank {
	private int accNo;
	private String accName;
	private float accBalance;
	
void printBankDetails() {
	System.out.println(accNo+"\n"+accName+"\n"+accBalance);
}

void insertBankData(int x,String y,float z) {
	accNo=x;
	accName=y;
	accBalance=z;
}
}
class  P1{
public static void main(String[] args) { 
Bank a= new Bank();
a.insertBankData(1234,"salini",5000);
a.printBankDetails();

}
}