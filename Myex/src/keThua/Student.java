package keThua;

public class Student extends Person{
    private Double dtb;
    private String classRoom;

    public Student(String name, String age, String address, Double dtb, String classRoom) {
        super(name, age, address);
        this.dtb = dtb;
        this.classRoom = classRoom;
    }
}
