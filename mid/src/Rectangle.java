// Concrete class Rectangle
public class Rectangle extends Shape {
    // Unique properties
    private double length;
    private double breadth;

    // Constructor
    public Rectangle(String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    // Methods
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}
