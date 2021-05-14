package comparable;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        Rectangle r2 = new Rectangle(2.3, 5.8);
        System.out.println(r2);
        Rectangle r3 = new Rectangle("orange", true, 2.3, 5.8);
        System.out.println(r3);
    }
}
