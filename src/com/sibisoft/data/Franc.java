package com.sibisoft.data;

public class Franc {
	private Integer amount ;
	
	public  Franc(Integer amount){
		this.amount = amount;
	}
	
	public Franc times(Integer multiplier){
		return (new Franc(this.amount * multiplier));
	}
	
	public boolean equals(Object object) {
		Franc franc = (Franc) object;
		return this.amount.intValue() == franc.amount.intValue();
	}
}
