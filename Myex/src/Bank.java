import java.text.NumberFormat;
import java.util.Scanner;

public class Bank {
    private long sotk;
    private String tentk;
    private double soTienTk;
Scanner sc = new Scanner(System.in);
    public Bank() {
    }

    public Bank(long sotk, String tentk, double soTienTk) {
        this.sotk = sotk;
        this.tentk = tentk;
        this.soTienTk = soTienTk;
    }

    public long getSotk() {
        return sotk;
    }

    public void setSotk(long sotk) {
        this.sotk = sotk;
    }

    public String getTentk() {
        return tentk;
    }

    public void setTentk(String tentk) {
        this.tentk = tentk;
    }

    public double getSoTienTk() {
        return soTienTk;
    }

    public void setSoTienTk(double soTienTk) {
        this.soTienTk = soTienTk;
    }

    @Override
    public String toString() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 =  currencyEN.format(soTienTk);
        return sotk + "-" + tentk + "-" +str1;
    }

    public double napTien() {
        double nap;
        System.out.print("Nhập số tiền bạn cần nạp: ");
        nap = sc.nextDouble();
        if (nap >= 0) {
            soTienTk += nap;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 =  currencyEN.format(nap);
            System.out.println("Bạn vừa nạp: " + str1 + " vào tài khoản.");
        } else {
            System.out.println("Đừng đùa giỡn nha.");
        }
        return nap;
    }

    public double rutTien() {
        double phi = 5;
        double rut;
        System.out.print("Bạn muốn rút bao nhiêu ?");
        rut = sc.nextDouble();
        if (rut <= (soTienTk - phi)) {
            soTienTk = soTienTk - (rut + phi);
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(rut);
            System.out.println("Bạn vừa rút " + str1 + "Đ từ tài khoản. Phí là 5đ.");
        } else {
            System.out.println("Vượt quá ngân sách !");
        }
        return rut;
    }

    public double daoHan() {
        double laiSuat = 0.035;
        soTienTk = (2 * soTienTk) * laiSuat;
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(soTienTk);
        System.out.println("Bạn vừa được " + str1 + " từ đáo hạng 1 tháng.");
        return soTienTk;
    }
    void inTK() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(soTienTk);
        System.out.printf("%-10d %-20s %-20s \n", sotk, tentk, str1);
    }
}
