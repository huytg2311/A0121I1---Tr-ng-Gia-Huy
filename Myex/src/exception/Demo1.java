package exception;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Demo1 {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        try {
            double c = div(a, b);
            System.out.println(a + " / " + b + " = " + c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("abc");
    }


    public static double div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("khong thuc hien phep chia");
        }
        return a / b;
    }
}
