package com.sibisoft.data;

public class Franc extends Money{
	
	public  Franc(Integer amount){
		this.amount = amount;
	}
	
	public Franc times(Integer multiplier){
		return (new Franc(this.amount * multiplier));
	}
}
