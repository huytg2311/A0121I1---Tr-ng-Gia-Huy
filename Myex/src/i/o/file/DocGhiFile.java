package i.o.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {

    // hàm viết vào file
    public static void writeToFile(List<Student> studentList) {
        try {
            FileWriter fileWriter = new FileWriter("data.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(txt);
//            for (String s : arr
//                 ) {    bufferedWriter.write(s);
//                 bufferedWriter.newLine();
//
//            }
            for (Student s : studentList) {
                bufferedWriter.write(s.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.write(studentList.toString());
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    // hàm main
    public static void main(String[] args) {
//        String txt = "Hasagiii";
//        String [] arr = {"Yasuo", "Lesin", "Zed"};

//        Student student = new Student("Faker", 10.0, "Math");
//        Student student1 = new Student("Trương Gia Huy", 9.0, "Code");
//        Student student2 = new Student("Trần Đức Lĩnh", 5.0, "Japanese");
//        Student student3 = new Student("Trần Đức Linh", 7.0, "Literature");
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(student);
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);

        DocGhiFile docGhiFile = new DocGhiFile();
        List<Student> studentList = docGhiFile.readFromFile();
        for (Student student: studentList
             ) {
            System.out.println(student);
            
        }
    }



    // hàm đọc file
    public List<Student> readFromFile() {
        List<Student> studentList = new ArrayList<>();
            try {
                FileReader fileReader = new FileReader("data.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = "";
                while (true) {
                    line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    String txt[] = line.split(" || ");
                    String name = txt[0];
                    double mark = Double.parseDouble(txt[1]);
                    String subject = txt[2];
                    studentList.add(new Student(name, mark, subject));
                }
            } catch (Exception e) {}
        return studentList;
    }
}
