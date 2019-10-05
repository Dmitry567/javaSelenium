package com.junit5.basics;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AssertionsUnit
{
	@DisplayName("standard assertions")
	@Test
	void test()
	{
		assertEquals(2, 1 + 1, "sum 1 + 1 must be 2");
		assertTrue(3 > 1, "inequality");
		assertFalse(1 > 11);
	}
	
	@Test
	void timeoutTest()
	{
		assertTimeout(Duration.ofMillis(10), () -> {Thread.sleep(100);});
	}
}
