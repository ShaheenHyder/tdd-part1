package com.sibisoft.data;

import java.util.Hashtable;

public class Bank {
	
	private Hashtable<Pair, Integer> rates = new Hashtable<Pair, Integer>();
	
	public Money reduce(IExpression source, String to) {
		return source.reduce(this,to);
	}
	public Integer rate(String from, String to) {
		if (from.equals(to)) return new Integer(1);
		return rates.get(new Pair(from,to));
	}
	public void addRate(String from, String to, Integer rate){
		rates.put(new Pair(from,to), new Integer(rate));
	}
}
