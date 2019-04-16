public class ShapeFactory {

    public Shape makeShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equals("circle")) {
            return new Circle();

        } else if (shapeType.equals("triangle")) {
            return new Triangle();

        } else if (shapeType.equals("square")) {
            return new Square();
        }

        return null;
    }
}


