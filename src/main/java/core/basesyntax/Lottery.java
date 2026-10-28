package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        int number = new Random().nextInt(100);
        ball.setNumber(number);
        ColorSupplier supplier = new ColorSupplier();
        ball.setColor(supplier.getRandomColor());
        return ball;
    }
}
