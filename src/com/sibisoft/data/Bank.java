package com.sibisoft.data;

public class Bank {
	public Money reduce(IExpression source, String to) {
		return source.reduce(this,to);
	}
	public Integer rate(String from, String to) {
		return (from.equals("CHF") && to.equals("USD"))? 2 : 1;
	}
	/*public void addRate(String from, String to, Integer rate){
		
	}
	*/
}
