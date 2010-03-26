package org.seamoo.utils.converter;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test for simple App.
 */
public class ConverterTest
{
	@Test
	public void testStringToElseConverter(){
		assertEquals(1, Converter.toInt("1"));
		assertEquals(1L, Converter.toLong("1"));
		assertEquals(true, Converter.toBoolean("true"));
	}
	
	@Test
	public void testElseToStringConverter(){
		assertEquals("true", Converter.toString(true));
		assertEquals("false", Converter.toString(false));
	}
}
