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
		five.times(2);
		assertEquals(new Integer(10), five.getAmount());
	}
}
