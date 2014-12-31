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
	public void testFrancMultiplication(){
		Money five =  Money.franc(new Integer(5));
		assertEquals( Money.franc(new Integer(10)),five.times(2));
		assertEquals( Money.franc(new Integer(15)), five.times(3));
	}
	
	@Test
	public void testEquality(){
		
		assertTrue(Money.dollar(new Integer(5)).equals(Money.dollar(new Integer(5))));
		assertFalse(Money.dollar(new Integer(5)).equals(Money.dollar(new Integer(6))));
		
		assertTrue(Money.franc(new Integer(5)).equals(Money.franc(new Integer(5))));
		assertFalse(Money.franc(new Integer(5)).equals(Money.franc(new Integer(6))));
	
		assertFalse(Money.franc(new Integer(5)).equals(Money.dollar(new Integer(5))));
	}
}
