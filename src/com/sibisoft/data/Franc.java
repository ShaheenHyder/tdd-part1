package com.sibisoft.data;

public class Franc extends Money{
	
	public Franc(Integer amount,String currency){
		super(amount,currency);
	}
	
	public Money times(Integer multiplier) {
		return Money.franc(amount * multiplier);
	}
}
