import java.util.Scanner;

public class GTNNInArray2 {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dong: ");
        m = sc.nextInt();
        System.out.println("Nhap so cot: ");
        n = sc.nextInt();
        System.out.println("Nhap so phan tu");

        int A[][] = new int[m][n];
        System.out.println("Nhap so phan tu: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("A[" + i + "][" + j + "]");
                A[i][j] = sc.nextInt();
            }
        }

        int min = A[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] < min) {
                    min = A[i][j];
                }
            }
        }
        System.out.println("So phan tu la: " + min);
    }
}
