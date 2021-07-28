package carrase;

public class RacingCar implements Car {

	public int getMileage() {
		return 1;
	}

	public void stop() {
	}

	public void moveForward() {
	}

	public void operate(CarBehavior behavior) {
		behavior.apply(this);
	}
}
