package i.o.file;

public class Student {
    private String name;
    private double mark;
    private String subject;

    public Student() {
    }

    public Student(String name, double mark, String subject) {
        this.name = name;
        this.mark = mark;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student Name: " + name + " || Mark: " + mark + " || Subject: " + subject;
    }
}
