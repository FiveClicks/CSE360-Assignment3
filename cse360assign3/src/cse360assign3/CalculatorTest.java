package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}
	
	@Test
	public void testgetTotal() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
	}
	
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(3);
		assertEquals(3, calc.getTotal());
	}
	
	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		calc.subtract(5);
		assertEquals(-5, calc.getTotal());
	}
	
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.multiply(5);
		assertEquals(50, calc.getTotal());
	}
	
	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		calc.add(8);
		calc.divide(2);
		assertEquals(4, calc.getTotal());
	}
	
	@Test
	public void testDividebyZero() {
		Calculator calc = new Calculator();
		calc.divide(0);
		assertEquals(0, calc.getTotal());
	}
	
	@Test
	public void testGetHistory() {
		Calculator calc = new Calculator();
		calc.add(4);
		calc.subtract(2);
		calc.multiply(2);
		calc.add(5);
		assertEquals("0 + 4 - 2 * 2 + 5", calc.getHistory());
	}
	
	@Test
	public void testGetHistory2() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.multiply(6);
		calc.subtract(5);
		calc.divide(11);
		calc.add(5);
		assertEquals("0 + 10 * 6 - 5 / 11 + 5", calc.getHistory());
	}
	
	@Test
	public void testGetHistory3() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.multiply(7);
		calc.subtract(3);
		calc.divide(2);
		calc.add(5);
		assertNotEquals("0 + 10 * 6 - 5 / 11 + 5", calc.getHistory());
	}
	
}
