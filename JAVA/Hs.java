package com.ust.examples;

class HelpService{
	private String formatNumber(int value) {
		return String.format("%d",value);
	}
	private String formatNumber(double value) {
		return String.format("%.3f,value");
	}
	private String formatNumber(String value) {
		return String.format("%.2f",Double.parseDouble(value));
	}


public class Hs{

	public static void main(String[] args) {
		HelpService hs = new HelpService();
		
		System.out.println(hs.formatNumber(500));
		System.out.println(hs.formatNumber(89.99));
		System.out.println(hs.formatNumber("500"));
	}}
	}



