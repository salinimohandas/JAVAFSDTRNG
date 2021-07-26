package com.ust.examples;

public class Outer {
	private void getValue()
	{
		int sum=20;
		class Inner{
			public int divisor;
			public int reminder;
			
			public Inner() {
				divisor=4;
				reminder=sum%divisor;
			}
			private int getDivisor() {
				return divisor;
			}
			private int getReminder() {
				return sum%divisor;
			}
			private int getQuotient()
			{
				System.out.println("Inside inner class");
				return sum/divisor;
			}
			}
		Inner inner = new Inner();
		System.out.println("Divisor= "+inner.getDivisor());
		System.out.println("Reminder= "+inner.getReminder());
		System.out.println("Quotient= "+inner.getQuotient());
			
		}
	
	public static void main(String[] args) {
	
		Outer outer = new Outer();
			outer.getValue();
}

}
