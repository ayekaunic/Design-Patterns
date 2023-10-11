// Client code snippet
public class Demo {
    public static void main(String[] args) {

        // Create different types of shapes using the ShapeFactory
        Shape circle = ShapeFactory.createShape("Circle");
        Shape rectangle = ShapeFactory.createShape("Rectangle");
        Shape triangle = ShapeFactory.createShape("Triangle");

        // Draw the shapes
        circle.draw();
        rectangle.draw();
        triangle.draw();

        // Calculate and display the area of the shapes
        System.out.println("Circle area = " + circle.calculateArea());
        System.out.println("Rectangle area = " + rectangle.calculateArea());
        System.out.println("Triangle area = " + triangle.calculateArea());
    }
}
