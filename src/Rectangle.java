public class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Đã vẽ hình chữ nhật có chiều cao " + height + " chiều rộng " + width);
    }
}
