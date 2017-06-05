package com.lee.you.junitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest
{

	private Calculator calculator = new Calculator();

	//测试用例初始化时执行 @BeforeClass 方法，当所有测试执行完毕之后，执行 @AfterClass 进行收尾工作
	@BeforeClass
	public static void init()
	{
		System.out.println("init...");
	}
	
	@Before
	public void setUp() throws Exception		// 每个 @Test方法执行前执行此方法, 对应的有个@After
	{
		calculator.clear();
	}

	@Test
	public void testAdd()
	{
		calculator.add(2);
		calculator.add(3);
		assertEquals(5, calculator.getResult());
	}

	@Test
	public void testSubstract()
	{
		calculator.add(10);
		calculator.substract(2);
		assertEquals(8, calculator.getResult());
	}

	@Ignore("Multiply() Not yet implemented")
	@Test
	public void testMultiply()
	{
	}

	@Test(timeout = 1000)				// 限时测试
	public void squareRoot()
	{
		calculator.squareRoot(4);
		assertEquals(2, calculator.getResult());
	}
	
	@Test
	public void testDivide()
	{
		calculator.add(8);
		calculator.divide(2);
		assertEquals(4, calculator.getResult());
	}
}
