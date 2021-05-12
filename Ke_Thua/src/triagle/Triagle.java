package triagle;

public class Triagle {
    private double size1 = 1.0;
    private double size2 = 1.0;
    private double size3 = 1.0;

    public Triagle() {
    }

    public Triagle(double size1, double size2, double size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    public double getArea() {
        return  (5 * this.size1) / 2;
    }

    public double getPerimeter() {
        return this.size1 + this.size2 + this.size3;
    }
    
    @Override
    public String toString() {
        return "A Triagle has size 1: " + getSize1() + ", size 2: " + getSize2()
                 + ", size 3: " + getSize3() + " ===> Area: " + getArea()
                + " and Perimeter: " + getPerimeter();
    }

}
