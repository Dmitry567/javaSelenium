package Order;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class MyAlphaNumericOrder
{
	@Test
	void btest()
	{
		System.out.println("btest");
	}
	
	@Test
	void atest()
	{
		System.out.println("atest");
	}
	
	@Test
	void ytest()
	{
		System.out.println("ytest");
	}
	
	@Test
	void xtest()
	{
		System.out.println("xtest");
	}
}
