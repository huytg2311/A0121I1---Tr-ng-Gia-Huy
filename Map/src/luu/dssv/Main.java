package luu.dssv;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//        Map<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("Yasuo", 20);
//        hashMap.put("Lesin", 5);
//        hashMap.put("Zed", 25);
//        hashMap.put("Faker", 1);
//        System.out.println("Display entries in HashMap");
//        System.out.println(hashMap + "\n");
//
//        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
//        System.out.println("Display entries in ascending order of key");
//        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Truong Gia Huy", 55);
        linkedHashMap.put("Nguyen Thi Thuy Trang", 13);
        linkedHashMap.put("Truong Van Chau", 12);
        linkedHashMap.put("Truong Ngoc Bao Uyen", 12);
        System.out.println("\nThe age for " + "Truong Van Chau is " + linkedHashMap.get("Truong Van Chau"));
    }
}
