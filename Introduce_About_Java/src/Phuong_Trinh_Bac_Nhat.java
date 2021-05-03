import java.util.Scanner;

public class Phuong_Trinh_Bac_Nhat {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextDouble();
        System.out.println("Enter b: ");
        b = sc.nextDouble();
        System.out.println("Enter c: ");
        c = sc.nextDouble();
        if (a != 0) {
            double answer = (c -b)/a;
            System.out.println("The solution is: " + answer);
        } else {
            if (b == 0) {
                System.out.println("The solution is all x !");
            } else {
                System.out.println("No Solution !");
            }
        }
    }
}
