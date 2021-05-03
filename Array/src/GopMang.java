import java.util.Scanner;

public class GopMang {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        float[] a = null;
        float[] b = null;
        float[] c = null;

        System.out.println("---Nhập mảng a---");
        a = input(a);
        System.out.println("---Nhập mảng b---");
        b = input(b);

        // trộn a và b ra c
        c = merge(a, b);

        // in mảng c
        show(c);
    }

    public static float[] input(float[] arr) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        // khởi tạo arr
        arr = new float[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void sortASC(float [] arr) {
        float temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    /**
     * trộn mảng a và b vào mảng c
     * sao cho c cũng duy trì thứ tự tăng dần.
     *
     * @param a: mảng a
     * @param b: mảng b
     * @return mảng c
     */
    public static float[] merge(float[] a, float[] b) {
        int aIndex = a.length - 1;
        int bIndex = b.length - 1;
        int cIndex = a.length + b.length - 1;
        float[] c = new float[cIndex + 1];

        // sắp xếp các mảng theo thứ tự tăng dần
        sortASC(a);
        sortASC(b);

        // trộn mảng a và b thành c
        for (int i = cIndex; i > -1; i--) {
            if (aIndex > -1 && bIndex > -1) {
                if (a[aIndex] > b[bIndex]) {
                    c[i] = a[aIndex--];
                } else {
                    c[i] = b[bIndex--];
                }
            } else if (bIndex == -1) {
                c[i] = a[aIndex--];
            } else if (aIndex == -1) {
                c[i] = b[bIndex--];
            }
        }
        return c;
    }

    /**
     * in các phần tử của mảng ra màn hình
     *
     // @param arr: mảng các số nguyên
     // @param n: số phần tử của mảng
     */
    public static void show(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

