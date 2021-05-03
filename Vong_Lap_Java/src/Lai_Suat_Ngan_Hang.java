import java.util.Scanner;

public class Lai_Suat_Ngan_Hang {
    public static void main(String[] args) {
        double money = 0;
        int month = 1;
        double rate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Money: ");
        money = sc.nextDouble();
        System.out.println("Enter Your Month: ");
        month = sc.nextInt();
        System.out.println("Enter Your Rate: ");
        rate = sc.nextDouble();
        double total = 0;
        for (int i = 0; i < month; i++) {
            total = money * ((rate/100)/12)  * 3;
        }
        System.out.println(total);
    }
}
