package com.sibisoft.data;

public class Dollar {
	private Integer amount ;
	
	public  Dollar(Integer amount){
		this.amount = amount;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public void times(Integer multiplier){
		this.amount *= multiplier;
	}
}
