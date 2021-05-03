public class ThemPhanTu {
    public static void main(String[] args) {
        int size = 20;
        int[] arr = new int[size];
        arr[0] = 10;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 8;
        int n = 5;
        int x = 9;

        System.out.print("Hide the array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        n = insert(arr, size, n, x);

        System.out.print("After add: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }
    static int insert(int[] arr, int size, int n, int x) {
        if (n >= size) {
            return n;
        }
            arr[3] = x;
            return n + 1;

    }
}

