package com.ust.examples;

interface Emp1
{
int eid=3029;
void geteid();
}
class ImplClass implements Emp1{
@Override
public void geteid() {
	System.out.println("Employee id is  "+eid);
}
}
public class Interface6 {

	public static void main(String[] args) {
		ImplClass ob = new ImplClass();
		ob.geteid();

	}

}
