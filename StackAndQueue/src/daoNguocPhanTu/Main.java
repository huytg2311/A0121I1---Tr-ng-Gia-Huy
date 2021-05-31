package daoNguocPhanTu;

import javax.imageio.stream.ImageInputStream;

public class Main {
    public static void reverse(StringBuffer str) {
        //Create a stack of capacity
        //equal to length of string
        int n = str.length();
        Stack obj = new Stack(n);

        //Push all characters of string to stack
        int i;
        for (i = 0; i < n; i++)
            obj.push(str.charAt(i));

            //Pop all characters of string
            //and put them back to str
            for (i = 0; i < n; i++) {
                char ch = obj.pop();
                str.setCharAt(i,ch);
        }
    }

    public static void main(String[] args) {
        //create a new string
        StringBuffer s = new StringBuffer("Truong Gia Huy");
        reverse(s);
        System.out.println("Reserved string is: " + s);
    }
}
