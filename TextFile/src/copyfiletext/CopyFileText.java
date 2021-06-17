package copyfiletext;

import java.io.*;


public class CopyFileText {

    // hàm main
    public static void main(String[] args) throws Exception {
        String txt = "Trời hôm nay nhiều may cực ~";
        writeToFile(txt);
        readFromFile(txt);

    }

    // hàm tạo viết vào file
    public static void writeToFile(String txt) throws IOException {
        try {

            FileWriter fileWriter = new FileWriter("bt1.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(txt);
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
        }
    }

    // hàm tạo đọc file
    public static void readFromFile(String txt) throws Exception {
        try {
            FileReader fileReader = new FileReader("bt1.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Exception e) {
        }
    }

}
