package triangle;

public class IllegalTriangleDemo {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,2,4);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }
}
