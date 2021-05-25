package backgroundContext;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class FuMemoryCached {
    private static HashMap<String, FuCached> cached = new HashMap<>();

    public static boolean putObject(String key, Object object, int timeToLive){
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, timeToLive);

        FuCached fuc = new FuCached(object, calendar.getTime());
        return cached.put(key, fuc) == null;
    }

    public static Object getObject(String key){
        FuCached fuCached = cached.get(key);
        Date now = new Date();
        if (fuCached.getExpiredDate().after(now)){
            return fuCached;
        } else {
            cached.remove(key);
            return null;
        }
    }

    public static boolean clean (String key){
        return cached.remove(key) == null;
    }

    public static boolean cleanAll(){
        cached.clear();
        return true;
    }

    public static void main(String[] args) {
        try {
            File file = new File("D:\\Module2 - Truong Gia Huy\\Myex\\src\\backgroundContext\\StudentList.txt");
            System.out.println(file.getAbsolutePath());
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String key = sc.next();
                Object obj = sc.nextLine().trim();
                FuMemoryCached.putObject(key, obj, 2);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        FuCached fuCached = (FuCached) FuMemoryCached.getObject("DE150176");
        System.out.println(fuCached.getData());
    }
}
