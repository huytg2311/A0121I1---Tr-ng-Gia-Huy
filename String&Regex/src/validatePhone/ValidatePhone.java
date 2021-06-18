package validatePhone;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhone {

    // hàm để kiểm tra đầu vào có đúng theo khuôn mẫu
    public static String getPhone() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        // dùng while để nhập lại sau mỗi lần số nhập vào không hợp lệ
        while (true) {
            System.out.println("Enter the number phone: ");
            input = scanner.nextLine();
            Pattern pattern = Pattern.compile("^\\([0-9]{2}\\)-\\([0]{1}[0-9]{9}\\)$");
            if (pattern.matcher(input).find()) {
                break;
            } else {
                System.err.println("The phone invalid !");
            }
        }
        return input;
    }

    // hàm main 
    public static void main(String[] args) {
        String phone = getPhone();
        System.out.println("The number phone is: " + phone);
    }
}
