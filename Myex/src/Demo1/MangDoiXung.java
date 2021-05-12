package Demo1;

import java.util.Scanner;

public class MangDoiXung {
    static boolean doiXung(int[] a) {
        for (int i = 0; i < a.length/2; i++)
            if (a[i] != a[a.length - 1])
                return false;
                return true;
            }

            static void display(int[] array) {
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                    System.out.println("Array doi xung: " + doiXung(array));
                }
            }

            static void nhap() {
            int n;
            int[] array;
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhap so phan tu: ");
                n = sc.nextInt();
                array = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("Nhap mang: array["+i+"]= ");
                    array[i] = sc.nextInt();
                }
                display(array);
            }

    public static void main(String[] args) {
        nhap();
    }
        }

