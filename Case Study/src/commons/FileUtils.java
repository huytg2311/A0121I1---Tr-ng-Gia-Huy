package commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    private static BufferedWriter bufferedWriter;
    private static BufferedReader bufferedReader;
    private static String path;

    public static void writeFile(String[] content) throws IOException {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            bufferedWriter.write(StringUtils.concat(content, StringUtils.COMMA));
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile() {

        List<String> arrayContent = new ArrayList<String>();

        try {
            bufferedReader = new BufferedReader(new FileReader(path));

            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                arrayContent.add(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayContent;
    }

    public static void setFullPathFile(String fileName) {
        StringBuffer path = new StringBuffer("D:\\Module2 - Truong Gia Huy\\Case Study\\src\\data\\");
        path.append(fileName);
        path.append(StringUtils.CSV);

        FileUtils.path = path.toString();
    }
}
