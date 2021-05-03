import java.util.Scanner;

public class Doc_So_Thanh_Chu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1 = sc.nextInt();
        String nameNum;
        switch (num1) {
            case 0:
                nameNum = "Zero";
                break;
            case 1:
                nameNum = "One";
                break;
            case 2:
                nameNum = "Two";
                break;
            case 3:
                nameNum = "Three";
                break;
            case 4:
                nameNum = "Four";
                break;
            case 5:
                nameNum = "Five";
                break;
            case 6:
                nameNum = "Six";
                break;
            case 7:
                nameNum = "Seven";
                break;
            case 8:
                nameNum = "Eight";
                break;
            case 9:
                nameNum = "Night";
                break;
            case 10:
                nameNum = "Ten";
                break;
            default:
                nameNum = "";
        }
        if (nameNum != "") {
            System.out.printf("Word of number %d is %s", num1, nameNum);
        }
    }
}
