import java.util.Scanner;

public class Chuyen_Doi_Tien_Te {
    public static void main(String[] args) {
        double vnd = 23.000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter money type USD: ");
        usd = sc.nextDouble();
        double chuyendoi = 23.000 * usd;
        System.out.println("Change money from VND to USD: " + chuyendoi);
    }
}
