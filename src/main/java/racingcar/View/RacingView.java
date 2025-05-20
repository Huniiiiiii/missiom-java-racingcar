package racingcar.View;

import racingcar.Model.Car;

import java.util.List;
import java.util.Scanner;

public class RacingView {
    private final Scanner scanner = new Scanner(System.in);

    public List<String> inputCarNames() {
        System.out.print("Car name(split by comma): ");
        return List.of(scanner.nextLine().split(","));
    }

    public int inputTryCount() {
        System.out.print("what time?: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void printRoundResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getStatus());
        }
        System.out.println();
    }

    public void printWinners(List<String> winners) {
        System.out.println("Winner : " + String.join(", ", winners));
    }

    public void printError(String message) {
        System.out.println("Input Error: " + message);
    }
}
