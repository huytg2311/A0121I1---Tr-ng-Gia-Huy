package geometry;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "A Rectangle is width = " +
                width +
                " and length = " + length +
                "Which is a subclass of " + super.toString();
    }
}
