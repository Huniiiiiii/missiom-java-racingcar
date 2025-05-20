package racingcar.Model;

import java.util.Random;

public class Car {
    private static final Random random = new Random();
    private final String name;
    private int position = 0;

    public Car(String name) {
        if (name.isEmpty() || name.length() > 5) {
            throw new IllegalArgumentException("car name must be less than 5 characters.");
        }
        this.name = name;
    }

    public void move() {
        if (random.nextInt(10) >= 4) position++;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public String getStatus() {
        return name + " : " + "-".repeat(position);
    }
}

