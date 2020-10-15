package questions;

import questions.vehicles.Aeroplane;
import questions.vehicles.Car;
import questions.vehicles.FlyingCar;

public class Vehicles {

	public void run() {
		Aeroplane aeroplane = new Aeroplane();
		aeroplane.fly();

		Car car = new Car();
		car.drive();

		FlyingCar fCar = new FlyingCar();
		fCar.drive();
		fCar.fly();
	}

	public static void main(String... args) {
		Vehicles v = new Vehicles();
		v.run();
	}
}
