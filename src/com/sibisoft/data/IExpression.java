package com.sibisoft.data;

public interface IExpression {
	Money reduce(Bank bank, String to);
	IExpression plus(IExpression addend);
	IExpression times(Integer multiplier);
}
