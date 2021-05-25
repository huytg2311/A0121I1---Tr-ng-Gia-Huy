package changeArrayListLibary;

public class TestMyArrayList {
    public static class Student {
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

    public static void main(String[] args) {
        Student a = new Student(1,"Huy");
        Student b = new Student(2,"Yasuo");
        Student c = new Student(3,"Zed");
        Student d = new Student(4,"Lesin");
        Student e = new Student(5,"Vayne");
   //     Student f = new Student(6,"Anh da den");
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
  //     studentMyArrayList.add(f,2);
        studentMyArrayList.size();


      //  for (int i = 0; i < studentMyArrayList.size(); i++) {
       //     Student student = (Student) studentMyArrayList.elements[i];
          //  System.out.println(student.getId());
          //  System.out.println(student.getName());
          //  System.out.println(studentMyArrayList.get(2).getName());
  //      }
       // System.out.println(studentMyArrayList.contains(b));
        newMyArrayList = studentMyArrayList.clone();
        Student student = newMyArrayList.remove(1);
        System.out.println(student.getName());
    //    for (int i = 0; i < newMyArrayList.size(); i++) {
    //        System.out.println(newMyArrayList.get(i).getName());
      //  }
    }
}
