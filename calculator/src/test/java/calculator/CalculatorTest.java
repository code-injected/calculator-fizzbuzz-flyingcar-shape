package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import questions.Calculator;
import questions.operators.DivisionOperator;
import questions.operators.SubtractOperator;

public class CalculatorTest {
	
	private Calculator c;

	
	@Before
	public void initialization(){
		Calculator.register(new SubtractOperator());
		Calculator.register(new DivisionOperator());
		c = new Calculator();
	}
	
	@Test
	public void testAddOperation(){
		double a = 44;
		double b = 23;
		double expected = 67;
		assertEquals(expected, c.evaluate("+", a, b), 0);
	}
	
	@Test
	public void testMultiplyOperation(){
		double a = 25;
		double b = 11;
		double expected = 275;
		assertEquals(expected, c.evaluate("*", a, b), 0);
	}
	
	@Test
	public void testSubtractOperation(){
		double a = 66;
		double b = 77;
		double expected = -11;
		assertEquals(expected, c.evaluate("-", a, b), 0);
	}
	
	@Test
	public void testDivisionOperation(){
		double a = 27;
		double b = 3;
		double expected = 9;
		assertEquals(expected, c.evaluate("/", a, b), 0);
	}

}
