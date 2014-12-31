package com.sibisoft.data.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sibisoft.data.Dollar;

public class DollarTest {

	@Test
	public void testDollar() {
		assertEquals(new Integer(5), new Dollar(new Integer(5)).getAmount());
	}
	
	@Test
	public void testMultiplication(){
		Dollar five = new Dollar(5);
		assertEquals(new Dollar(new Integer(10)),five.times(2));
		assertEquals(new Dollar(new Integer(15)), five.times(3));
	}
	
	@Test
	public void testEquality(){
		assertTrue(new Dollar(new Integer(5)).equals(new Dollar(new Integer(5))));
		assertFalse(new Dollar(new Integer(5)).equals(new Dollar(new Integer(6))));
	}
}
