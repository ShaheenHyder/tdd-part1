package com.sibisoft.data.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import com.sibisoft.data.Money;

public class DollarTest {

	@Test
	public void testMultiplication(){
		Money five = Money.dollar(new Integer(5));
		assertEquals(Money.dollar(new Integer(10)),five.times(2));
		assertEquals(Money.dollar(new Integer(15)), five.times(3));
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
}
