package GeneratorOfShapesWithProperties;


public abstract class Figure {
    private String color;
    private String name;

    public Figure (String name){
        this.name = name;
    }
    public Figure (){}

    public abstract void draw();
    public abstract double getArea();
    public Color getColor(){
        return Color.getRandomColor();
    }
}
