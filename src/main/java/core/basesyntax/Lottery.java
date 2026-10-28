package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;

    private ColorSupplier colorSupplier = new ColorSupplier();

    private Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int number = random.nextInt(MAX_RANDOM_NUMBER);
        ball.setNumber(number);
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
