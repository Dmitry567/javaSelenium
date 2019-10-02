package com.junit5.params;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

class DDT
{
	@ParameterizedTest(name = "print palindromes")
	@ValueSource(strings = {"racecar", "radar", "Madam Im Adam"})
	void test(String pal)
	{
		System.out.println(pal);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {24, 66, 99})
	void valueSourceAsInts(int num)
	{
		System.out.println(num);
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "ddt.csv", numLinesToSkip = 1)
	void ddtTest(int test, String name, String expected)
	{
		System.out.println(test + " " + name + " " + expected);
	}
}
