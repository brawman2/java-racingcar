package racingcar;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingGameTest {

	@Test
	@DisplayName("우승자 구하기")
	void getWinner() {
		List<String> names = Arrays.asList("pobi", "crong", "honux");
		RacingGame game = new RacingGame(names);
		game.run();
		assertThat(game.getWinners()).containsAnyOf(names.stream().toArray(String[]::new));
	}

	@Test
	@DisplayName("전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다")
	void getResult() {
		List<String> names = Arrays.asList("pobi", "crong", "honux");
		RacingGame game = new RacingGame(names);
		game.run();
		assertThat(game.getGameResult()).containsKeys(names.stream().toArray(String[]::new));
	}
}
