package commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validators {
    // Tạo biến hàng cú pháp nhập
    public static final String SERVICE_CODE_REGEX = "SV(VL|HO|RO)-[\\d]{4}";
    public static final String SERVICE_NAME_REGEX = "[A-Z][a-z]*";

    public static Pattern pattern;
    public static Matcher matcher;

    // Mã định dạng của Service : SVXX - YYYY ||   XX - > VL,HO,RO && YYYY -> 0-9
    public static boolean isValidService(String str, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(str);

        boolean flag = matcher.matches();
        if (!flag) {
            System.out.println("Input not matching " + regex);//Nếu kh bằng thì sẽ hiện cho người dùng regex
        }
        return flag;
    }

    // AreUse > 30 && PoolArea > 30
    public static boolean isMoreThan(double number, double startNumber, double endNumber) {
        boolean flag = number > ;
        if (!flag) {
            System.out.println("Input not more than " + destNumber);
        }
        return flag;
    }

}
