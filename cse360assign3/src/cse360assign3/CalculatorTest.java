package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}

	public void testgetTotal() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
	}
	
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(3);
		assertEquals(3, calc.getTotal());
	}
	
	public void testSubtract() {
		Calculator calc = new Calculator();
		calc.subtract(5);
		assertEquals(-5, calc.getTotal());
	}
	
	public void testMultiply() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.multiply(5);
		assertEquals(2, calc.getTotal());
	}
	
	public void testDivide() {
		Calculator calc = new Calculator();
		calc.add(8);
		calc.divide(2);
		assertEquals(4, calc.getTotal());
	}
	
	public void testDividebyZero() {
		Calculator calc = new Calculator();
		calc.divide(0);
		assertEquals(0, calc.getTotal());
	}
	
	public void testGetHistory() {
		fail("Not yet implemented");
	}
	
}
