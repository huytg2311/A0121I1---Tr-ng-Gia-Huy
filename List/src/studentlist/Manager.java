package studentlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manager {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Nguyen Van A", 20, 7.0);
        Student student2 = new Student("Nguyen Van B", 50, 5.0);
        Student student3 = new Student("Nguyen Van C", 27, 10.0);
        Student student4 = new Student("Nguyen Van D", 37, 3.0);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        Manager manager = new Manager();
//        manager.f0(students);
//        manager.f1(students);
//        manager.f3(students);
//        manager.f4(students);
//        manager.f5(students);
        List<Student> list1 = manager.f6(students);
        for (Student o : list1) {
            System.out.println(o);
        }

    }

    // ham hien thi danh sach
    public static void f0(List<Student> list) {
        for (Student o : list) {
            System.out.println(o);
        }
    }

    // hien thi diem >= 5
    public static void f1(List<Student> list) {
        int count = 0;
        for (Student o : list) {
            if (o.getAge() >= 5) {
                count++;
            }
        }
        System.out.println("List mark student over or equal 5: " + count);
    }

    // sap xep tang dan theo tuoi
    public static void f3(List<Student> list) {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() < o2.getAge()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for (Student o : list) {
            System.out.println(o);
        }
    }

    // sap xep tang dan theo diem
    public static void f4(List<Student> list) {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getMark() > o2.getMark()) {
                    return 1;
                } else if (o1.getMark() < o2.getMark()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        for (Student o : list) {
            System.out.println(o);
        }
    }

    // hien thi thong tin cua "nguyen van b"
    public static void f5(List<Student> list) {
        System.out.println(list.get(1));
    }

    // hien thi thong tin hoc sinh 10d
    public ArrayList<Student> f6(List<Student> list) {
        ArrayList<Student> list10 = new ArrayList<>();
        for (Student o : list) {
            if (o.getMark() == 10.0) {
                list10.add(o);
            }
        }
        return list10;
    }

}
