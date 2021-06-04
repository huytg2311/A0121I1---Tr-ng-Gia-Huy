package pb.hashmap.hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student stu = new Student("Huy",19,"Da Nang");
        Student stu1 = new Student("Lan",20,"Quang Tri");
        Student stu2 = new Student("Huong",21,"Da Nang");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,stu);
        studentMap.put(2,stu1);
        studentMap.put(3,stu2);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }

        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(stu);
        students.add(stu1);
        students.add(stu2);
        students.add(stu1);

        for (Student student : students) {
            System.out.println(stu1.toString());
        }
    }
}
