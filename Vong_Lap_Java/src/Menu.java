import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Menu----");
        System.out.println("1. Sound of Yasuo");
        System.out.println("2. Sound of Dog");
        System.out.println("3. Sound of Cat");
        System.out.println("4. Sound of Feeder");
        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hasagiii");
                    break;
                case 2:
                    System.out.println("Gau Gau");
                    break;
                case 3:
                    System.out.println("Meow Meow");
                    break;
                case 4:
                    System.out.println("Anh Ganh Team Ban");
                    break;
                default:
                    System.out.println("No choice");
            }
        }
    }
}
