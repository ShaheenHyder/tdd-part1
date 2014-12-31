package com.sibisoft.data;

public class Dollar extends Money {
	
	public  Dollar(Integer amount){
		this.amount = amount;
	}
	
	public Dollar times(Integer multiplier){
		return (new Dollar(this.amount * multiplier));
	}
	
	public boolean equals(Object object) {
		Dollar dollar = (Dollar) object;
		return this.amount.intValue() == dollar.amount.intValue();
	}
}
