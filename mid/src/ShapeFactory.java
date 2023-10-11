// ShapeFactory class
public class ShapeFactory {
    public static Shape createShape(String shapeType) {
        switch (shapeType) {
            case "Circle":
                return new Circle("Red", 5.0);
            case "Rectangle":
                return new Rectangle("Green", 10.0, 5.0);
            case "Triangle":
                return new Triangle("Blue", 5.0, 3.0);
            default:
                throw new IllegalArgumentException("Invalid shape type: " + shapeType);
        }
    }
}
