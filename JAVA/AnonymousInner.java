package com.ust.examples;

interface Empl11{
	int eid=3902;
	void geteid();
}
public class AnonymousInner {

	public static void main(String[] args) {
		Empl11 ob = new Empl11() {
			@Override
			public void geteid()
			{
				System.out.println("Employee id is ="+eid);
			}
		};
		
		ob.geteid();
	}

}
