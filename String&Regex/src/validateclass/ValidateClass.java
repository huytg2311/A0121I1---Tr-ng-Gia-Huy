package validateclass;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateClass {

    public static String getNameClass() {
        Scanner scanner = new Scanner(System.in);
        String test = "";
        while (true) {
            System.out.println("Enter name of class: ");
            test = scanner.nextLine();
            Pattern pattern = Pattern.compile("^[C,P,A,^!@#$%^&*()_+<>?:{}|][0-9]{4}[G,H,I,K,L,M]$");
            if (pattern.matcher(test).find()) {
                break;
            } else {
                System.err.println("Name class invalid!");
            }
        }
        return test;
    }

    public static void main(String[] args) {
        String nl = getNameClass();
        System.out.println("Class name: " + nl);

    }
}
