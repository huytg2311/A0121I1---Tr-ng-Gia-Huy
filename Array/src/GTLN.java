import java.util.Scanner;

public class GTLN {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        size = sc.nextInt();
        do {
            if (size > 20) {
                System.out.println("Please don't enter not exceed 20 !");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter elements: ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("Propety list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Element largest is: " + max + " of " + index + " st.");
    }
}