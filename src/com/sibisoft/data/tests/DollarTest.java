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
	
	@Test
	public void testReduceMoneyDifferentCurrency(){
		Bank bank = new Bank();
		bank.addRate("CHF","USD",2);
		Money result = bank.reduce(Money.franc(new Integer(2)),"USD");
		assertEquals(Money.dollar(new Integer(1)),result);
	}
	
	@Test
	public void testIdentityRate(){
		assertEquals(new Integer(1), new Bank().rate("USD", "USD"));
	}
	
	@Test
	public void testArrayEquals(){
		//assertEquals(new Object[]{"abc"} , new Object[]{"abc"});
		//assertArrayEquals(new Object[]{"abc"} , new Object[]{"abc"});
	}
	
	@Test
	public void testMixedAddition(){
		//$5 + 10 CHF = $10 if rate is 2:1
		IExpression fiveBucks = Money.dollar(new Integer(5));
		IExpression tenFrancs = Money.franc(new Integer(10));
		IExpression expectedResult = Money.dollar(new Integer(10));
		Bank bank = new Bank();
		bank.addRate("CHF","USD",2);
		Money result = bank.reduce(fiveBucks.plus(tenFrancs),"USD");
		assertEquals(expectedResult, result);

	}
	
	@Test
	public void testSumPlusMoney(){
		//$5 + 10 CHF = $10 if rate is 2:1
		IExpression fiveBucks = Money.dollar(new Integer(5));
		IExpression tenFrancs = Money.franc(new Integer(10));
		IExpression expectedResult = Money.dollar(new Integer(15));
		Bank bank = new Bank();
		bank.addRate("CHF","USD",2);
		IExpression sum = new Sum(fiveBucks,tenFrancs).plus(fiveBucks);
		Money result = bank.reduce(sum,"USD");
		assertEquals(expectedResult, result);

	}
		
	@Test
	public void testSumTimes(){
		//($5*2 + CHF10*2) = $20
		IExpression fiveBucks = Money.dollar(new Integer(5));
		IExpression tenFrancs = Money.franc(new Integer(10));
		IExpression expectedResult = Money.dollar(new Integer(20));
		
		Bank bank = new Bank();
		bank.addRate("CHF","USD",2);
		
		IExpression times = new Sum(fiveBucks,tenFrancs).times(2);
		
		Money result = bank.reduce(times,"USD");
		assertEquals(expectedResult, result);
		
	}
}
