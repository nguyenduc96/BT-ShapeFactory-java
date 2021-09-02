public class ShapeFactory {
    private ShapeFactory() {

    }

    public static final Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE: {
                return new Circle(10);
            }
            case SQUARE: {
                return new Square(10);
            }
            case RECTANGLE: {
                return new Rectangle(15,20);
            }
            default: {
                throw new IllegalArgumentException("Không hỗ trợ vẽ hình này");
            }
        }
    }

    public enum ShapeType {
        CIRCLE, SQUARE, RECTANGLE;
    }
}
