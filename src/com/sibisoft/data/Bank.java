package com.sibisoft.data;

public class Bank {
	public Money reduce(IExpression source, String to) {
		return source.reduce(to);
	}
}
