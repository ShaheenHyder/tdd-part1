package com.sibisoft.data;

 public class Money implements IExpression{
	
	protected Integer amount;
	protected String currency;
	
	public Money(Integer amount, String currency){
		this.amount = amount;
		this.currency = currency;
	}
	
	public static Money dollar(Integer amount){
		return new Money(amount,"USD");
	}
	
	public static Money franc(Integer amount) {
		return new Money(amount,"CHF");
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
	public IExpression plus(Money addend){
		return new Sum(this,addend);
		
	}
	public Money reduce(Bank bank,String to) {
		int rate = bank.rate(currency, to);
		return new Money(amount/rate,to);
	}
}
