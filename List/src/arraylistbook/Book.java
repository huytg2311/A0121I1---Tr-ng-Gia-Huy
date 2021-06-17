package arraylistbook;

public class Book {
    private String name;
    private int code;
    private double price;
    private String brand;

    public Book() {
    }

    public Book(String name, int code, double price, String brand) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return name + " Book" + "||" + "Code: " + code + " || Price: " + price + " VND || Brand: " + brand;
    }
}
