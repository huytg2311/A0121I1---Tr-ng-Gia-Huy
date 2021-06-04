package sapxep.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Doremon", 19, "Japan");
        Student student2 = new Student("Ton Ngo Khong", 35, "China");
        Student student3 = new Student("Yasuo" , 20, "Viet Nam");
        Student student4 = new Student("Anh Da Den", 20, "USA");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi: ");
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}
