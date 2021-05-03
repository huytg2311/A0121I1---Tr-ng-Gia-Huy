public class Phuong_Trinh_Bac_2 {
    double a, b, c;
    double dental;
    public Phuong_Trinh_Bac_2() {}

    public Phuong_Trinh_Bac_2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return dental = (b*b) - (4 * a * c);
    }

    public double getRoot1() {
        return (-b + Math.sqrt((b*b) - (4 * a * c))) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt((b*b) - (4 * a * c))) / (2 * a);
    }

    //public String display() {
      //  return ""
    //}
}
