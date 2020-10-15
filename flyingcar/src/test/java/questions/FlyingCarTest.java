package questions;
import org.junit.Before;
import org.junit.Test;

import questions.vehicles.FlyingCar;


public class FlyingCarTest {

	private FlyingCar fCar;
	
	@Before
	public void initialization(){
		fCar = new FlyingCar();
	}
	
	@Test
	public void testDrive() {
		fCar.drive();
	}
	
	@Test
	public void testFly(){
		fCar.fly();
	}

}
