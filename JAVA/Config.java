package com.ust.examples;

public class Config{
	final static String NAME="CONFIG";
	final long initTime;
	Config()
	{
		this.initTime=System.currentTimeMillis();
	}
	
	

	public static void main(String[] args) {
		Config cfg2 = new Config();
		System.out.println(cfg2.initTime);
		

	}

}
