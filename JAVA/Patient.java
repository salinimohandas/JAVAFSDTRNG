package com.ust.examples;


class PatentInfo{
	
	private String name;
	private int age;
	boolean vaccinated;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isVaccinated() {
		return vaccinated;
	}
	public void setVaccinated(boolean vaccinated) {
		this.vaccinated = vaccinated;
		
			}
	
}
public class Patient {

	public static void main(String[] args) {
		PatentInfo p= new PatentInfo();
		p.setName("Anu");
		p.setAge(21);
		
		p.setVaccinated(true);
		if(p.isVaccinated()==true) {
			System.out.println(p.getName()+" "+p.getAge()+" "+"vaccinated");
		}
		else
		{
			System.out.println(p.getName()+" "+p.getAge()+" "+"Not vaccinated");			
		}
		
	}

}
