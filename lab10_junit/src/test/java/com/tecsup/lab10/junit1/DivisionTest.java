package com.tecsup.lab10.junit1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivisionTest {

	@Test
	public void testDivision() {		
		Division app = new Division();		
		assertEquals(7 , app.division(4, 3));
	}
	
}
