package main;

import java.util.Arrays;

import calculator.Calculator;
import calculator.CalculcatorUI;
import carrase.CarRasingGame;
import carrase.CarRacingGameUI;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		// 계산기
		//app.runCalculator();

		// 레이싱 게임
		app.runRacingGame();
	}

	private void runCalculator() {
		Calculator calculator = new Calculator();
		CalculcatorUI.printIntro();
		int result = calculator.calculate(CalculcatorUI.getInput());
		CalculcatorUI.printResult(result);
	}

	private void runRacingGame() {
		CarRacingGameUI ui = new CarRacingGameUI();

		ui.printQuestionOfCarName();
		CarRasingGame game = new CarRasingGame(Arrays.asList(ui.getCarNames()));
		ui.printQuestionOfGameCount();

		int countOfGame = ui.getInput();

		ui.printMessageOfGameResult();
		for(int i = 0; i < countOfGame; i++) {
			game.start();
			ui.printResult(game.getGameResult());
		}
	}
}
