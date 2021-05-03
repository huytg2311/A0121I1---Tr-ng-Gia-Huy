import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        double a = sc.nextDouble();
        System.out.print("Enter number b: ");
        double b = sc.nextDouble();
        System.out.print("Enter number c: ");
        double c = sc.nextDouble();
        Phuong_Trinh_Bac_2 pt = new Phuong_Trinh_Bac_2(a, b, c);
        System.out.println("Hide dental: " + pt.getDiscriminant());
        if (pt.getDiscriminant() >= 0) {
            System.out.println("Root 1 : " + pt.getRoot1());
            System.out.println("Root 2: " + pt.getRoot2());
        } else {
            System.out.println("Zero");
        }



    }
}
