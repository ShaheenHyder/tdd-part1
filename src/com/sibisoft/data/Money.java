package com.sibisoft.data;

abstract public class Money {
	
	protected Integer amount;
	protected String currency;
	
	public static Money dollar(Integer amount){
		return new Dollar(amount,"USD");
	}
	
	public static Money franc(Integer amount) {
		return new Franc(amount,"CHF");
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return (this.amount.intValue() == money.amount.intValue() &&
				this.getClass().equals(money.getClass()));
	}
	
	abstract public Money times(Integer multiplier);
	
	public String currency(){
		return currency;
	}
}
