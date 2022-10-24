package com.tecsup.lab10.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ApplicationTest {

	@Test
	public void testSumar() {		
		Application app = new Application();		
		assertEquals(12 , app.multiplicacion(4, 3));
	}
	

}
