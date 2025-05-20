package racingcar.Controller;

import racingcar.Model.RacingGame;
import racingcar.View.RacingView;

import java.util.List;

public class RacingController {
    private final RacingView view = new RacingView();

    public void run() {
        try {
            List<String> names = view.inputCarNames();
            int attempts = view.inputTryCount();

            if (attempts <= 0) throw new IllegalArgumentException("must plus.");

            RacingGame game = new RacingGame(names);

            System.out.println("\n실행 결과");
            for (int i = 0; i < attempts; i++) {
                game.playRound();
                view.printRoundResult(game.getCars());
            }

            view.printWinners(game.getWinners());
        } catch (Exception e) {
            view.printError(e.getMessage());
        }
    }
}
