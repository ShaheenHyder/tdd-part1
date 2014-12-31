package com.sibisoft.data;

public class Dollar extends Money {
	
	public  Dollar(Integer amount){
		this.amount = amount;
	}
	
	public Dollar times(Integer multiplier){
		return (new Dollar(this.amount * multiplier));
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return this.amount.intValue() == money.amount.intValue();
	}
}
