package bublesort;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Size [" + i + "] : ");
            array[i] = sc.nextInt();
        }

        System.out.print("Element in the array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        bubbleSortByStep(array);

    }

    public static void bubbleSortByStep(int[] array) {
        boolean needNextPass = true;
        for (int i = 1; i < array.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    System.out.println("Swap " + array[i] + " width " + array[j + 1]);
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    needNextPass = true;
                }
            }

            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }

            System.out.println("List after the " + i + "' sort: ");
            for (int k = 0; k < array.length; k++) {
                System.out.print(array[k] + " ");
            }
            System.out.println();
        }

    }
}

