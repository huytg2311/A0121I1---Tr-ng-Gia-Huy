package csv;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Csv {
    public static List<CsvGetSet> readData() {
        List<CsvGetSet> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("src\\csv\\bt2.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            CsvGetSet csvGetSet = null;
            String[] data = null;
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                csvGetSet = new CsvGetSet();
                data = line.split(",");
                csvGetSet.setIp1(data[0]);
                csvGetSet.setIp2(data[1]);
                csvGetSet.setS1(data[2]);
                csvGetSet.setS2(data[3]);
                csvGetSet.setN1(data[4]);
                csvGetSet.setN2(data[5]);
                list.add(csvGetSet);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        List<CsvGetSet> list = readData();
        for (CsvGetSet cs : list) {
            System.out.println(cs.getIp1() + "," + cs.getIp2() +
                    "," + cs.getS1() + "," + cs.getS2() + "," +
                    cs.getN1() + cs.getN2());
        }
    }


}

