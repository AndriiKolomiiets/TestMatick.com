package GeneratorOfShapesWithProperties;

import java.util.Random;

public class Trapezium extends Figure {

    private String name;
    private int lengthA;
    private int lengthB;
    private int height;
    private int area;

    public Trapezium() {
        getDimensions();
        this.name = "trapeze";
    }

    @Override
    public void draw() {
        System.out.println("Trapezium was drawn successfully.");
    }

    @Override
    public double getArea() {
        return area = Math.round((lengthA + lengthB) / 2 * height);
    }

    public int getSmallerSideLength() {
        if (lengthB > lengthA) {
            return lengthA;
        } else {
            return lengthB;
        }
    }

    public void getDimensions() {
        Random random = new Random();
        lengthA = random.nextInt(10) + 1;
        lengthB = random.nextInt(10) + 1;
        height = random.nextInt(8) + 1;
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", area: " + getArea() + ", color: " + getColor() + ", length of a smaller side: " + getSmallerSideLength();
    }

}
