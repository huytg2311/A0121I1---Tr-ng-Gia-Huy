package comparable;

import java.util.Arrays;

public class ComparableTest {
    public static void main(String[] args) {
        ComparableCircle[] c = new ComparableCircle[3];
        c[0] = new ComparableCircle(3.6);
        c[1] = new ComparableCircle();
        c[2] = new ComparableCircle("indigo", false, 3.5);

        System.out.println("Pre - sorted: ");
        for (ComparableCircle circle : c) {
            System.out.println(c);
        }

        Arrays.sort(c);

        System.out.println("After - sorted: ");
        for (ComparableCircle circle : c) {
            System.out.println(c);
        }

    }
}
