package com.sibisoft.data;

 public class Money {
	
	protected Integer amount;
	protected String currency;
	
	public Money(Integer amount, String currency){
		this.amount = amount;
		this.currency = currency;
	}
	
	public static Money dollar(Integer amount){
		return new Dollar(amount,"USD");
	}
	
	public static Money franc(Integer amount) {
		return new Franc(amount,"CHF");
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return (this.amount.intValue() == money.amount.intValue() &&
				this.currency().equals(money.currency()));
	}
	
	public Money times(Integer multiplier) {
		return new Money(amount * multiplier,currency);
	}
	
	public String currency(){
		return currency;
	}
	public String toString() {
		return amount + " " + currency;
	}
}
