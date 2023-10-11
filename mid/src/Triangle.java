// Concrete class Triangle
public class Triangle extends Shape {
    // Unique properties
    private double base;
    private double height;

    // Constructor
    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    // Methods
    @Override
    public void draw() {
        System.out.println("Drawing a triangle...");
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }
}
