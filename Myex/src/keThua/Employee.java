package keThua;

public class Employee extends Person{
    private String congViec;

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public Employee(String name, String age, String address, String congViec) {
        super(name, age, address);
        this.congViec = congViec;


    }
}
