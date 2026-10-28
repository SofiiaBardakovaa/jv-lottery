package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_RANDOM_NUMBER = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int number = new Random().nextInt(MAX_RANDOM_NUMBER);
        ball.setNumber(number);
        ColorSupplier supplier = new ColorSupplier();
        ball.setColor(supplier.getRandomColor());
        return ball;
    }
}
