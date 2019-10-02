package com.jsuite.tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("production")
class ProductionTests
{
	@Test
	void testProduction()
	{
		System.out.println("test in production");
	}
}
