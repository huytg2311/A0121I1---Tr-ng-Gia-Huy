import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        a = sc.nextInt();
        System.out.println("Enter the number b: ");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
            while (a != b) {
                if (a > 0)
                    a = a - b;
                 else
                    b = b - a;

            }
            System.out.println("Greatest common factor: " + a);
        }
    }
}
