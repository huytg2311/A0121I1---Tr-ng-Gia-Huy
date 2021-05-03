import java.util.Scanner;

public class So_Nguyen_To_Dau_Tien {
    public static void main(String[] args) {
        int number;
        int count = 0;
        int N = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first n primes: ");
        number = sc.nextInt();
        if (number >= 1) {
            System.out.println(number + " the first numbers of primes");
            System.out.println(2);
        }
        for (int i = 2; i <= number;) {
            for (int j = 2; j < Math.sqrt(N); j++) {
                if (N % j == 0) {
                    count = 0;
                    break;
                }
            }
            if (count != 0) {
                System.out.println(N);
                i++;
            }
            count = 1;
            N++;
        }
    }
}
