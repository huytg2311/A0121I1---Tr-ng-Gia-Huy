package array.seting;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LKSoLanTuBanPhim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("Nhap cac phan tu mang: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("a[" + i + "] = ");
                arr[i] = scanner.nextInt();
        }
        //tim so lan xuat hien
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            addElement(map, arr[i]);
        }
        System.out.println("Cac phan tu xuat hien mot lan: ");
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.print(key + " ");
            }
        }
    }

    public static void addElement(Map<Integer, Integer> map, int element) {
        if (map.containsKey(element)) {
            int count = map.get(element) + 1;
            map.put(element, count);
        } else {
            map.put(element, 1);
        }

    }
}
