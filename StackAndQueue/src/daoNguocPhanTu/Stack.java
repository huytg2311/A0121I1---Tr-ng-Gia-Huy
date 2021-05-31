package daoNguocPhanTu;

public class Stack {
    int size;
    int top;
    char[] a;

    boolean isEmty() {
        return (top < 0);
    }

    Stack(int n) {
        top = -1;
        size = n;
        a = new char[size];
    }

    boolean push(char x) {
        if (top >= size) {
            System.out.println("Stack OverFlow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

    char pop() {
        if (top < 0) {
            System.out.println("Stack UnderFlow");
            return 0;
        } else {
            char x = a[top--];
            return x;
        }
    }
}
