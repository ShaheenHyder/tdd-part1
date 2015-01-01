package com.sibisoft.data;

public class Sum implements IExpression{
	public IExpression augend;
	public IExpression addend;
	
	public Sum(IExpression augend, IExpression addend) {
		this.augend= augend;
		this.addend= addend;
	}
	public Money reduce(Bank bank,String to) {
		int amount = augend.reduce(bank, to).amount	+ addend.reduce(bank, to).amount;
		return new Money(amount, to);
	}
	
	@Override
	public IExpression times(Integer multiplier) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public IExpression plus(IExpression addend) {
		// TODO Auto-generated method stub
		return null;
	}
}
