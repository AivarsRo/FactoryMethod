public class Main {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.makeShape("circle");
        shape1.drawShape();
        shape1.countCorners();

        Shape shape2 = factory.makeShape("triangle");
        shape2.drawShape();
        shape2.countCorners();

        Shape shape3 = factory.makeShape(("square"));
        shape3.drawShape();
        shape3.countCorners();

    }
}
