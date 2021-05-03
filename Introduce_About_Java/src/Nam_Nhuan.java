import java.util.Scanner;

public class Nam_Nhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter Year: ");
        year = sc.nextInt();
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisible100 = year % 100 == 0;
            if (isDivisible100) {
                boolean isDivisible400 = year % 400 == 0;
                if (isDivisible400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
    if (isLeapYear) {
        System.out.printf("%d is a leap year", year);
    } else {
        System.out.printf("%d is NOT a leap year", year);
    }
    }
}
