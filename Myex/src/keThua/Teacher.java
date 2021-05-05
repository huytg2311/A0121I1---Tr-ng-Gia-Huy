package keThua;

public class Teacher extends Person{
    private String monHoc;
    private String trinhDo;

    public Teacher(String name, String age, String address, String monHoc, String trinhDo) {
        super(name, age, address);
        this.monHoc = monHoc;
        this.trinhDo = trinhDo;
    }
}
