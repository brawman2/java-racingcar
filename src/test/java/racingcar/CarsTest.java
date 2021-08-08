package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarsTest {

	@Test
	@DisplayName("우승자 찾기")
	void winners() {
		Car car1 = new Car();
		Cars cars = new Cars();
		assetThat(cars.getWinners())
	}


}
