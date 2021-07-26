package com.ust.examples;

class Car11{
	String carName;
	String carType;
	
	public Car11(String name,String type) {
		this.carName=name;
		this.carType=type;
	}
	private String getCharName() {
		return this.carName;
	}
	class Engine{
		String engineType;
		void setEngine() {
			if(Car11.this.carType.equals("4WD")) {
				if(Car11.this.getCharName().equals("Crysler")) {
					this.engineType="Smaller";
				}
				else
				{
					this.engineType="Bigger";
				}
				
			}
			else {
				this.engineType="Bigger";
			}
		}
		String getEngineType() {
			return this.engineType;
		}
	}
}


public class Example43 {

	public static void main(String[] args) {
		Car11 car1=new Car11("Mazda","BMW");
		Car11.Engine engine=car1.new Engine();
		engine.setEngine();
		System.out.println("Engine Type for 8WD="+engine.getEngineType());
		
		Car11 car2=new Car11("Crysler","4Wd");
		Car11.Engine c2engine=car2.new Engine();
		engine.setEngine();
		System.out.println("Engine Type for 8WD="+engine.getEngineType());
		
		Car11 car3=new Car11("Maruthi","ford");
		Car11.Engine c3engine=car3.new Engine();
		engine.setEngine();
		System.out.println("Engine Type for 8WD="+engine.getEngineType());
		

	}

}
