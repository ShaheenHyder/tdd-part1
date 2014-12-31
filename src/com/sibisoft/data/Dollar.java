package com.sibisoft.data;

public class Dollar extends Money {
	
	private String currency;
	
	public  Dollar(Integer amount){
		this.amount = amount;
		this.currency = "USD";
	}
	
	public Money times(Integer multiplier){
		return (new Dollar(this.amount * multiplier));
	}
	
	public String currency(){
		return currency;
	}
}
