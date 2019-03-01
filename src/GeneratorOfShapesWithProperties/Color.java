package GeneratorOfShapesWithProperties;

import java.util.Random;

public enum Color {
    red,
    blue,
    white,
    yellow,
    pink,
    purple;
    public static Color getRandomColor(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
