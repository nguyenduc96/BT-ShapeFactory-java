public class Main {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape(ShapeFactory.ShapeType.CIRCLE);
        shape.draw();
        System.out.println("------------------");
        shape = ShapeFactory.getShape(ShapeFactory.ShapeType.SQUARE);
        shape.draw();
        System.out.println("------------------");
        shape = ShapeFactory.getShape(ShapeFactory.ShapeType.RECTANGLE);
        shape.draw();
    }
}
