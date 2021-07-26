package com.ust.examples;

class CPU1{
	double price;
	class Processor{
		double cores;
		String manufaturer;
		
		double getCache() {
			return 4.3;
		}
	}
	protected class RAM{
		double memory;
		String manufaturer;
		
		double getClockSpeed() {
			return 5.5;
		}
	}
}
public class Example42 {

	public static void main(String[] args) {
		CPU1 cpu = new CPU1();
		CPU1.Processor processor=cpu.new Processor();
		CPU1.RAM ram = cpu.new RAM();
		System.out.println("Processor Cache="+processor.getCache());
		System.out.println("Ram Clock Speed="+ram.getClockSpeed());
	}

}
