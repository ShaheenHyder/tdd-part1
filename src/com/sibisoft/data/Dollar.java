package com.sibisoft.data;

public class Dollar extends Money {
	
	private String currency;
	
	public  Dollar(Integer amount,String currency){
		this.amount = amount;
		this.currency = currency;
	}
	
	public Money times(Integer multiplier){
		return Money.dollar(this.amount * multiplier);
	}
	
	public String currency(){
		return currency;
	}
}
