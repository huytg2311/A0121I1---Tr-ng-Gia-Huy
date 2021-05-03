import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        int size = 20;
        int[] arr = new int[size];
        arr[0] = 10 ;
        arr[1] = 4 ;
        arr[2] = 6 ;
        arr[3] = 7 ;
        arr[4] = 8 ;
        arr[5] = 6 ;
        arr[6] = 0 ;
        arr[7] = 0 ;
        arr[8] = 0 ;
        arr[9] = 0 ;
        int n = 10;
        System.out.println("==============================================================");
        System.out.print("Hide elements in array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " , ");}

            int x = 7;
            n = delete(arr, n, x);

            System.out.println("\n==============================================================");
            System.out.print("Hide elements in array after delete: ");
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " , ");


    }
    static int delete(int[] arr, int n, int x) {
        int pos = searchElement(arr, x);
        if (pos == -1) {
            System.out.println("Not found");
        }
        for (int i = pos; i < n; i++) {
            arr[i] = arr[i + 1];
        }
        return n - 1;
    }
    static int searchElement(int[] arr, int x) {
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] == x)
                return i;
        }
        return  -1;
    }
}