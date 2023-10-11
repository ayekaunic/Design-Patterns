// Concrete class Circle
public class Circle extends Shape {
    // Unique property
    private double radius;

    // Constructor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Methods
    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
