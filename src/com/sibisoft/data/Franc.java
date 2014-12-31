package com.sibisoft.data;

public class Franc extends Money{
	
	public  Franc(Integer amount){
		this.amount = amount;
	}
	
	public Money times(Integer multiplier) {
		return new Franc(amount * multiplier);
	}
}
