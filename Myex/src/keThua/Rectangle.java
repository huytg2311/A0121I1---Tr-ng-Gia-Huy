package keThua;

public class Rectangle extends Geometric{
    private Double width;
    private Double height;

    public Rectangle() {
    }

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, String filled, Double width, Double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return width * height;
    }
}
