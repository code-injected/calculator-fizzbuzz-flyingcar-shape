package question;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import questions.Rectangle;
import questions.properties.CustomProperty;

public class ShapeTest {
	
	private Rectangle r ;
	
	@Before
	public void initialize(){
		r = new Rectangle();
	}

	@Test
	public void testAddDrawingProperty() {
		r.registerProperty(new CustomProperty("Property test 1"));
		r.registerProperty(new CustomProperty("Property test 2"));
		r.registerProperty(new CustomProperty("Property test 3"));
		int expected = 3;
		
		assertEquals(expected, r.getNumberProperties(), 0);
	}
	
	@Test
	public void testClearDrawingProperties(){
		r.registerProperty(new CustomProperty("Property test 1"));
		r.registerProperty(new CustomProperty("Property test 2"));
		r.registerProperty(new CustomProperty("Property test 3"));
		r.clearProperties();
		int expected = 0;
		
		assertEquals(expected, r.getNumberProperties(), 0);
	}

}
