package circleCylinder;

public class Cynlider extends Circle{
    private double chieuCao;

    public Cynlider(double radius, String color, double chieuCao) {
        super(radius, color);
        this.chieuCao = chieuCao;
    }

    public double getVolume() {
        return this.chieuCao * Math.PI + this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "A cynlider has color " + getColor() + " with radius " + getRadius() +"and the height "
                + chieuCao + " ===> Volume: " + getVolume();
    }
}
