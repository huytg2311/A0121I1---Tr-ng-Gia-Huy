package commons;

public class ConvertUtils {

    public static String normalizeStr(String str) {
        StringBuilder stringBuilder = new StringBuilder(str.substring(0,1).toUpperCase());
        stringBuilder.append(str.substring(1).toLowerCase());
        return stringBuilder.toString();
    }
}
