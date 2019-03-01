package GeneratorOfShapesWithProperties;

import java.util.Random;

public class Square extends Figure {
    private String name;
    private int lengthOfSide;
    private int area;

    public Square() {
        this.name = "square";
        getLengthOfSide();
    }

    public int getLengthOfSide() {
        Random random = new Random();
        return lengthOfSide = random.nextInt(10) + 1;
    }

    @Override
    public void draw() {
        System.out.println("Square was drawn successfully.");
    }

    @Override
    public double getArea() {
        return area = lengthOfSide ^ 2;
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", area: " + getArea() + ", color: " + getColor() + ", length of side: " + lengthOfSide;
    }
}
