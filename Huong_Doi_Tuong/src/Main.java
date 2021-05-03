import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = sc.nextDouble();
        System.out.print("Enter the length: ");
        double length = sc.nextDouble();
        Rectangle rc = new Rectangle(width, length);
        System.out.println("Your Rectangle: \n" + rc.display());
        System.out.println("Perimeter of rectangle: " + rc.getPerimeter());
        System.out.println("Area of rectangle: " + rc.getArea());
    }
}
