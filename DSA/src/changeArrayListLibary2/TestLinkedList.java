package changeArrayListLibary2;

public class TestLinkedList {
    public static void main(String[] args) {
        class Student {
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1,"Vo cuc kiem");
        Student student2 = new Student(2,"Cuong Dao");
        Student student3 = new Student(3,"Sung Hextech");
        Student student4 = new Student(4,"Tam hop kiem");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        myLinkedList.addLast(student4);

//        System.out.println(myLinkedList.constrains(student4));
        System.out.println(myLinkedList.indexOf(student3));

  //      MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();


//        for (int i = 0; i < cloneLinkedList.size(); i++) {
//            Student student = (Student) cloneLinkedList.get(i);
//            System.out.println(student.getName());
//        }
    }
}
