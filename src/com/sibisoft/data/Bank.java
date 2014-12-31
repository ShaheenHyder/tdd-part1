package com.sibisoft.data;

public class Bank {
	public Money reduce(IExpression source, String to) {
		Sum sum= (Sum) source;
		return sum.reduce(to);
	}
}
