public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double raius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double raius, String color) {
        this.speed = speed;
        this.on = on;
        this.raius = raius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRaius() {
        return raius;
    }

    public void setRaius(double raius) {
        this.raius = raius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on == true) {
            return "Speed: " + speed +  " Color: " + color + " Radius: " + raius + " Fan is on";
        } else {
            return "Speed: " + speed +  " Color: " + color + " Radius: " + raius + " Fan is off";
        }
    }
}
