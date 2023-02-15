import jdk.swing.interop.SwingInterOpUtils;

public class StringUtils {
    final static int COUNT_OF_ENGLISH_LETTERS = 26;

    public static char getFirstSymbol(String string) {
        System.out.println(COUNT_OF_ENGLISH_LETTERS);
        return string.charAt(0);
    }

    public static char getLastSymbol(String string) {
        int len = string.length();
        return string.charAt(len - 1);
    }



}
