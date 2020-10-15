package questions;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import questions.NumberGeneration;

public class NumberGenerationTest {
	
	private NumberGeneration n;

	
	@Before
	public void initialization(){

		n = new NumberGeneration();
	}
	
	@Test
	public void testNumber(){
		int a = 44;
		String expected = String.valueOf(a);
		assertEquals(expected, n.calculateResult(a));
	}
	
	@Test
	public void testFizzBuzz(){
		int a = 15;
		String expected = "FizzBuzz";
		assertEquals(expected, n.calculateResult(a));
	}
	
	@Test
	public void testFizz(){
		int a = 27;
		String expected = "Fizz";
		assertEquals(expected, n.calculateResult(a));
	}
	
	@Test
	public void testBuzz(){
		int a = 25;
		String expected = "Buzz";
		assertEquals(expected, n.calculateResult(a));
	}

}
