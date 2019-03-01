package GeneratorOfShapesWithProperties;

public class Triangle extends Figure {
    private double area;
    private String name;
    private double base;
    private double height;

    public Triangle() {
        name = "triangle";
        setDimensions();
    }

    private void setDimensions() {
        base = 2.5;
        height = 5.0;
    }

    @Override
    public void draw() {
        System.out.println("Triangle was drawn successfully.");
    }

    @Override
    public double getArea() {
        return area = (base * height) / 2;
    }

    public double getHypotenuse() {
        return Math.round(Math.sqrt(base + base + height * height));
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", area: " + getArea() + ", color: " + getColor() + ", length of a hypotenuse: " + getHypotenuse();
    }
}
