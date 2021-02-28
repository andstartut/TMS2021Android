package editors;

public class TextFormatterUtil {

    protected static boolean hasNotEmpty(String text) {
        if (text != null && !text.isEmpty() && !text.isBlank()) {
            return true;
        } else {
            return false;
        }
    }

    protected static int countWordsInLine(String text) {
        return text.split("[.,:;?!\\s]").length;
    }
}
