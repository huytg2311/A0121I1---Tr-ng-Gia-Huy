package Demo1;

import java.util.Scanner;

public class TongPhanSo {
    public static void main(String[] args) {
        int tuSo;
        int mauSo;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap tu so: ");
            tuSo = sc.nextInt();
            System.out.println("Nhap mau so: ");
            mauSo = sc.nextInt();
        } while (tuSo < 0 && mauSo < 0);

        int array[] = new int[tuSo/mauSo];

        for (int i = 1; i < array.length; i++) {
            sum += (tuSo/mauSo);
        }
        System.out.println("Tong la: " + sum);
    }
}
