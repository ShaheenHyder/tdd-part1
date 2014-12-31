package com.sibisoft.data;

public class Money {
	protected Integer amount;
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return this.amount.intValue() == money.amount.intValue();
	}
}
