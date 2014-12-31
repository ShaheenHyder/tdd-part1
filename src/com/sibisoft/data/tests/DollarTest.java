package com.sibisoft.data.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sibisoft.data.Dollar;
import com.sibisoft.data.Franc;

public class DollarTest {

	@Test
	public void testMultiplication(){
		Dollar five = new Dollar(5);
		assertEquals(new Dollar(new Integer(10)),five.times(2));
		assertEquals(new Dollar(new Integer(15)), five.times(3));
	}
	@Test
	public void testFrancMultiplication(){
		Franc five = new Franc(5);
		assertEquals(new Franc(new Integer(10)),five.times(2));
		assertEquals(new Franc(new Integer(15)), five.times(3));
	}
	
	@Test
	public void testEquality(){
		assertTrue(new Dollar(new Integer(5)).equals(new Dollar(new Integer(5))));
		assertFalse(new Dollar(new Integer(5)).equals(new Dollar(new Integer(6))));
	}
}
