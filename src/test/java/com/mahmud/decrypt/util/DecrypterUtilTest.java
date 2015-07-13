package com.mahmud.decrypt.util;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.mahmud.decrypt.util.DecrypterUtil;




public class DecrypterUtilTest {

	

	@Test
	public void testDecyptingCapitalC() {
		
		String actual = DecrypterUtil.decrypt("C",2);
		
		assertEquals("A", actual);
	}
	
	@Test
	public void testDecyptingCapitalZ() {
		
		String actual = DecrypterUtil.decrypt("Z",2);
		
		assertEquals("X", actual);
	}
	
	
	@Test
	public void testDecyptingLowera() {
		
		String actual = DecrypterUtil.decrypt("a",2);
		
		assertEquals("y", actual);
	}

}
