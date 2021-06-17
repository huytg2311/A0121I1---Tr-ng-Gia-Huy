package validateaccount;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    // Vì bài tập validate account giống vs validate email nên em
    // sáng tạo lại bài này nha anh <3

    public static String getAcount() {
        Scanner scanner = new Scanner(System.in);
        String account = "";
        while (true) {
            System.out.println("Enter account: ");
            account = scanner.nextLine();
            Pattern pattern = Pattern.compile("^[A-Za-z0-9]{10}$");
            if (pattern.matcher(account).find()) {
                break;
            } else {
                System.err.println("Account invalid!");
            }
        }
        return account;
    }

    public static String getPas() {
        Scanner scanner = new Scanner(System.in);
        String password = "";
        while (true) {
            System.out.println("Enter password: ");
            password = scanner.nextLine();
            Pattern pattern = Pattern.compile("^[A-Z]*[0-9a-z]{8,31}$");
            if (pattern.matcher(password).find()) {
                break;
            } else {
                System.err.println("Password invalid!");
            }
        }
        return password;
    }

    public static void main(String[] args) {
        String acc = getAcount();
        System.out.println("Account: " + acc);
        String pss = getPas();
        System.out.println("Password: " + pss);
    }
}
