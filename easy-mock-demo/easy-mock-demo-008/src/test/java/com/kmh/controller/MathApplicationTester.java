package com.kmh.controller;

import org.easymock.EasyMockRunner;
import org.easymock.EasyMockSupport;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.kmh.service.CalculatorService;

@RunWith(EasyMockRunner.class)
public class MathApplicationTester extends EasyMockSupport {

	private MathApplication mathApplication1;
	private MathApplication mathApplication2;

	private CalculatorService calcService1;
	private CalculatorService calcService2;

	@Before
	public void setUp() {
		mathApplication1 = new MathApplication();
		mathApplication2 = new MathApplication();
		calcService1 = createNiceMock(CalculatorService.class);
		calcService2 = createNiceMock(CalculatorService.class);
		mathApplication1.setCalculatorService(calcService1);
		mathApplication2.setCalculatorService(calcService2);
	}

	@Test
	public void testCalcService() {

		// activate all mocks
		replayAll();

		// test the add functionality
		Assert.assertEquals(mathApplication1.add(20.0, 10.0), 0.0, 0);

		// test the subtract functionality
		Assert.assertEquals(mathApplication1.subtract(20.0, 10.0), 0.0, 0);

		// test the multiply functionality
		Assert.assertEquals(mathApplication1.divide(20.0, 10.0), 0.0, 0);
		// test the divide functionality
		Assert.assertEquals(mathApplication1.multiply(20.0, 10.0), 0.0, 0);

		// test the add functionality
		Assert.assertEquals(mathApplication2.add(20.0, 10.0), 0.0, 0);

		// test the subtract functionality
		Assert.assertEquals(mathApplication2.subtract(20.0, 10.0), 0.0, 0);

		// test the multiply functionality
		Assert.assertEquals(mathApplication2.divide(20.0, 10.0), 0.0, 0);

		// test the divide functionality
		Assert.assertEquals(mathApplication2.multiply(20.0, 10.0), 0.0, 0);

		// verify all the mocks
		verifyAll();
	}
}