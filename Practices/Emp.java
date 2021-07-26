package com.ust.examples;

 abstract class Emplo{
public String name;
private int paymentPerHour;

void display() {
	System.out.println("Name is  "+name+"\n"+"Employee hour  "+paymentPerHour);
}
public Emplo() {
	
}

public Emplo(String name, int paymentPerHour) {
	this.name=name;
	this.paymentPerHour=paymentPerHour;
}


public void setName(String name) {
	this.name=name;
}
public int getPaymentPerHour() {
	return paymentPerHour;
}
abstract void salary(int x,int y);
	}

public class Emp extends Emplo {
	Emp(){
		super();
	}
	Emp(String name, int paymentPerHour){
		
		super(name,paymentPerHour);
	}
	void salary(int days,int tot_salary) {
		if((tot_salary/days)>500)
		{
			System.out.println("The pay is good");
		}
		else
		{
			System.out.println("The pay is not good");
		}
		}
	
public static void main(String[] args) {
	
		Emp e1 = new Emp("shkl",587);
		e1.display();
		Emp e2 = new Emp();
		e2.setName("Alina");
	    System.out.println(e2.getPaymentPerHour());
		e2.salary(600,1000);
        
		
		
		
		
		
		
	}

}
