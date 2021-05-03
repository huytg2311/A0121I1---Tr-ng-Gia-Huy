import java.util.Scanner;

public class Tinh_Ngay_Trong_Thang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What month do you want to know ?");
        int month = sc.nextInt();
        String dayInMonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                dayInMonth = "31";
                        break;
            case 2:
                dayInMonth = "28 or 29";
                        break;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                dayInMonth = "30";
                        break;
            default:
                dayInMonth = "";
        }
        if (dayInMonth != "") {
            System.out.printf("The month '%d' has %s days !", month, dayInMonth);
        } else {
            System.out.println("Invalid Input !");
        }
    }
}
