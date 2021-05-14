package comparable;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        c1 = new Circle(3.5);
        System.out.println(c1);
        c1 = new Circle("indigo",false, 3.5);
        System.out.println(c1);
    }
}
