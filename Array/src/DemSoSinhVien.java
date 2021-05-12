import com.sun.media.sound.RIFFInvalidDataException;

import java.util.Scanner;

public class DemSoSinhVien {
    public static void main(String[] args) {
        System.out.print("==========================");
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
        System.out.println("How many students enter to application ?");
        size = sc.nextInt();
        if (size > 30)
            System.out.println("Please Enter not exceed 30 students !");
        } while (size > 30);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Point of student: " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        
        int count = 0;
        System.out.println("List of mark");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\nThe number of student passing the exam is " + count);
        }
    }
