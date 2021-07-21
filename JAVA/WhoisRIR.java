package com.ust.examples;

public enum WhoisRIR {
	ARIN("Whois.arin.net"),
	RIPE("Whois.ripe.net"),
	APNIC("Whois.apnic.net"),
	AFRINIC("Whois.afrinic.net"),
	LACNIC("Whois.lacnic.net"),
	JPNIC("Whois.jpnic.net"),
	KRNIC("Whois.krnic.net"),
	CNNIC("Whois.cnnic.net"),
	UNKNOWN("");
	
	private String url;
	
	WhoisRIR(String url){
		
		this.url=url;
	}
		public String url() {
			return url;
		}
	}


