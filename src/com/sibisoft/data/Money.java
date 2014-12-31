package com.sibisoft.data;

abstract public class Money {
	protected Integer amount;
	
	public static Money dollar(Integer amount){
		return new Dollar(amount);
	}
	
	public static Money franc(Integer amount) {
		return new Franc(amount);
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return (this.amount.intValue() == money.amount.intValue() &&
				this.getClass().equals(money.getClass()));
	}
	
	abstract public Money times(Integer multiplier);
}
