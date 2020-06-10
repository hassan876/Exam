package lab;

import static org.junit.Assert.*;

import org.junit.Test;

public class LabTest{
	
	
	
	@Test
	public void TestCaseForFahernheitToCentigradeConversion()
	{
		assertEquals(4 ,  Lab.fahrenheitToCentigrade(40));
	}
	
	@Test
	public void TestCaseForCentigradeToFahrenheitConversion()
	{
		assertEquals(122 ,  Lab.centigradeToFahrenheit(50));
	}
	
	@Test
	public void TestCaseForSignofExclamation()
	{
		assertEquals("How are you" ,  Lab.removeSignOfExclaimation("How are you!"));
	}
	
	@Test
	public void TestCaseForGettingCurrentDay()
	{
		assertEquals(10 ,  Lab.getCurrentDay());
	}
	
	@Test
	public void TestCaseForGettingCurrentMonth()
	{
		assertEquals(6 ,  Lab.getCurrentMonth());
	}
	
	@Test
	public void TestCaseForGetCurrentYear()
	{
		assertEquals(2020 ,  Lab.getCurrentYear());
	}
	
}
