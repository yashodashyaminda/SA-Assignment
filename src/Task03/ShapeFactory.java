package Task03;

public class ShapeFactory {
    public Shape getShape(String ShapeType) {
        if (ShapeType == null) {
            return null;
        }

        if (ShapeType.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (ShapeType.equalsIgnoreCase("Circle")) {
            return new Circle();

        } else if (ShapeType.equalsIgnoreCase("Triangle")) {
            return new Triangle();

        } else if (ShapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else {
            System.out.println("Invalid shape type provided.");
        }

        return null;
    }
}
