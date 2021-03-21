import java.util.Map;
import java.util.TreeMap;

public class Practice {
    String text = "мама мыла раму мамы мыла меня";

    public static void main(String[] args) {

    }

    public void countWords() {
        String[] words = text.split("\\s");
        Map<String, Integer> wordsMap = new TreeMap<>();
        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                wordsMap.put(word, wordsMap.get(word) + 1);
            } else {
                wordsMap.put(word, 1);
            }
        }
        for (String keys : wordsMap.keySet()) {
            System.out.println(keys + " " + wordsMap.get(keys));
        }
    }
}
