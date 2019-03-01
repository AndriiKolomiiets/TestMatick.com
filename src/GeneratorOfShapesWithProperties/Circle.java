package GeneratorOfShapesWithProperties;

import java.util.Random;

public class Circle extends Figure {
    private String name;
    private int radius;
    private double area;

    public Circle() {
        this.name = "circle";
        getRadius();
    }

    @Override
    public void draw() {
        System.out.println("Circle was drawn successfully.");
    }

    @Override
    public double getArea() {
        return area = Math.round(Math.PI * radius * radius);
    }

    public int getRadius() {
        Random random = new Random();
        return radius = random.nextInt(10) + 1;
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", area: " + getArea() + ", color: " + getColor() + ", radius: " + radius;
    }
}
