package domain.numbergenerator;

import domain.strategy.Generator;

import java.util.Random;

import static domain.utils.CarConstant.MAX;
import static domain.utils.CarConstant.MIN;

public class RandomGenerator implements Generator {

    private final Random random = new Random();

    public Integer generate() {
        return random.nextInt(MAX) + MIN;
    }
}
