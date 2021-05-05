package keThua;

public class TestRectangleCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        circle.setFilled("black");
        System.out.println("A circle " + circle.toString());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter " + circle.getDiameter());
        System.out.println();
        Rectangle rectangle = new Rectangle(2.0,4.0);
        System.out.println("A rectangle " + rectangle.toString());
        System.out.println("The perimeter " + rectangle.getPerimeter());
        System.out.println("The area " + rectangle.getArea());
        System.out.println();
    }
}
