package com.sibisoft.data;

public class Franc extends Money{
	
	private String currency;
	
	public  Franc(Integer amount){
		this.amount = amount;
		this.currency = "CHF";
	}
	
	public Money times(Integer multiplier) {
		return new Franc(amount * multiplier);
	}
	
	public String currency(){
		return currency;
	}
}
