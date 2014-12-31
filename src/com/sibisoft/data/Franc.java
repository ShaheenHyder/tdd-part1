package com.sibisoft.data;

public class Franc extends Money{
	
	private String currency;
	
	public  Franc(Integer amount,String currency){
		this.amount = amount;
		this.currency = currency;
	}
	
	public Money times(Integer multiplier) {
		return Money.franc(amount * multiplier);
	}
	
	public String currency(){
		return currency;
	}
}
