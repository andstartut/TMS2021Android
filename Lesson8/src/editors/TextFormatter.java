package editors;

public class TextFormatter {

    public static String textMirroring(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static boolean hasPalindrome(String word) {
        if (TextFormatterUtil.hasNotEmpty(word)) {
            word = word.toLowerCase().trim();
            if (word.equals(textMirroring(word).toLowerCase())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static String getSentenceWithThreeToFiveWords(String text) {
        String result = "";
        String[] words;
        String[] sentences = text.split("(?<=[.:;?!])");
        for (int i = 0; i < sentences.length; i++) {
            words = sentences[i].split("[.,:;?!\s]+");
            for (String word : words) {
                if (hasPalindrome(word)) {
                    result = result.concat(sentences[i].concat(" "));
                    break;
                } else if (words.length > 2 && words.length < 6) {
                    result = result.concat(sentences[i]).concat(" ");
                    break;
                }
            }
        }
        return result;
    }
}
