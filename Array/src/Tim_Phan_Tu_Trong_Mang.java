import java.util.Scanner;

public class Tim_Phan_Tu_Trong_Mang {
    public static void main(String[] args) {
      String[] students = {"yasuo", "lesin", "zed", "lucian", "vayne", "faker"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String input_name = sc.nextLine();
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println(input_name + " of number " + (i + 1) + " in the array");
                break;
            } else {
                System.out.println("Not found");
                break;
            }
        }
    }
}
