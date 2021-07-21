package com.ust.examples;

public class Employee1 {
	
	String fName;
	String lName;
	String city;
	String address;
	String dob;
	float salary;
	
	Employee1(String a,String b,String c,String d,String e,float g ){
		
fName=a;
lName=b;
city=c;
address=d;
dob=e;
salary=g;
		
		
		
	}
	void display(){
		System.out.println(fName+""+lName+""+city+""+address+""+dob+""+salary);
			
		} 
	public static void main(String[] args) {
		
		//Employee1 e1 = new Employee1(" suma ","raj "," bangalore "," No.31,4th cross "," 03-03-1990 ",23000.0f);
		//Employee1 e2 = new Employee1(" sanju ","kuriacose "," Ekm "," thy "," 07-11-1990 ",24500.0f);
		//Employee1 e3 = new Employee1(" Salini ","Mohandas "," palakkad "," retg "," 23-05-1995 ",23000.0f);
		//Employee1 e4 = new Employee1(" Akila","ryui "," thrissur "," rygtr,4th cross "," 27-03-1998 ",30000.0f);
		//Employee1 e5 = new Employee1(" Alona","jioi "," palakkad "," gtryh "," 03-03-1999 ",20000.0f);
		Employee1 array[]= new Employee1[5];
		
		array[0]= new Employee1(" suma ","raj "," bangalore "," No.31,4th cross "," 03-03-1990 ",23000.0f);
		array[1]= new Employee1(" sanju ","kuriacose "," Ekm "," thy "," 07-11-1990 ",24500.0f);
		array[2]= new Employee1(" Salini ","Mohandas "," palakkad "," retg "," 23-05-1995 ",23000.0f);
		array[3]= new Employee1(" Akila","ryui "," thrissur "," rygtr,4th cross "," 27-03-1998 ",30000.0f);
		array[4]= new Employee1(" Alona","jioi "," palakkad "," gtryh "," 03-03-1999 ",20000.0f);
		
		for(int i=0;i<array.length;i++) {
			array[i].display();
			
		}
		
		
		
		
		/*for(Employee1 e:array) {
			
		
		//System.out.println(e.fname+""+e.lName+""+e.city+""+e.address+""+e.dob+""+e.salary);
			e.display();
		}*/
		
		/*	e1.display();
		e2.display();
		e3.display();
		e4.display();
		e5.display();
	*/}

}
