package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class RacingGame {
	private Cars cars;
	public RacingGame(String names) {
		this.cars = new Cars(createCarNames(names));
	}

	private List<Car> createCarNames(String names) {
		String[] carNames = names.split(",");
		List<Car> cars = new ArrayList<>();

		for (String carName : carNames) {
			cars.add(new Car(carName));
		}
		return cars;
	}

	public void run() {
		cars.move();
	}

	public List<String> getWinners() {
		return cars.getWinners()
			.stream()
			.map(Car::getName)
			.map(CarName::toString)
			.collect(Collectors.toList());
	}

	public Map<String, Integer> getGameResult() {
		this.cars.getAll()
	}
}
