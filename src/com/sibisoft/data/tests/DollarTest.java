package com.sibisoft.data.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sibisoft.data.Bank;
import com.sibisoft.data.IExpression;
import com.sibisoft.data.Money;
import com.sibisoft.data.Sum;

public class DollarTest {

	@Test
	public void testMultiplication(){
		Money five = Money.dollar(new Integer(5));
		assertEquals(Money.dollar(new Integer(10)),five.times(new Integer(2)));
		assertEquals(Money.dollar(new Integer(15)), five.times(new Integer(3)));
	}
	
	@Test
	public void testEquality(){
		
		assertTrue(Money.dollar(new Integer(5)).equals(Money.dollar(new Integer(5))));
		assertFalse(Money.dollar(new Integer(5)).equals(Money.dollar(new Integer(6))));
		assertFalse(Money.franc(new Integer(5)).equals(Money.dollar(new Integer(5))));
	}
	
	@Test
	public void testCurrency(){
		assertEquals("USD",Money.dollar(new Integer(1)).currency());
		assertEquals("CHF",Money.franc(new Integer(1)).currency());
	}
	
	@Test
	public void testSimpleAddition(){
		
		IExpression sum= new Sum(Money.dollar(new Integer(3)), Money.dollar(new Integer(4)));
		Bank bank= new Bank();
		Money result= bank.reduce(sum, "USD");
		assertEquals(Money.dollar(new Integer(7)), result);
	}
	
	@Test
	public void testReduceMoney(){
		Bank bank= new Bank();
		Money result= bank.reduce(Money.dollar(new Integer(1)), "USD");
		assertEquals(Money.dollar(1), result);
	}
	
}
