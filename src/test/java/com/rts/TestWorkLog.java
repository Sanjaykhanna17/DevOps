package com.rts;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWorkLog {
	
	WorkLog workLog = new WorkLog();
	
	@Test
	public void testAddToLog1() {
		assertEquals("Added Log for Remo", workLog.addToLog("Remo"));
	}
	
	@Test
	public void testAddToLog2() {
		assertEquals("Added Log for Sanjay", workLog.addToLog("Sanjay"));
	}
	
	@Test
	public void testAddLogins1() {
		assertEquals("Added Login Log for Remo", workLog.addLogins("Remo"));
	}
	
	@Test
	public void testAddLogins2() {
		assertEquals("Added Login Log for Sanjay", workLog.addLogins("Sanjay"));
	}

}
