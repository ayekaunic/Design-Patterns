// Abstract base class Shape
public abstract class Shape {
    // Common properties
    protected String color;

    // Methods
    public abstract void draw();
    public abstract double calculateArea();

    // Constructor
    public Shape(String color) {
        this.color = color;
    }
}
