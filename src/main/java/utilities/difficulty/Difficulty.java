package utilities.difficulty;

import java.util.Random;

public abstract class Difficulty {
    protected abstract int number();

    public boolean getAPassNumber() {
        Random random = new Random();

        return random.nextInt(10) > number();
    }
}
