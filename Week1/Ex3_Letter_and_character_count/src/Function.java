import java.util.*;

public class Function {

    public static Map<String, Integer> CountWords(String Content) {
        ArrayList<String> words = new ArrayList<>();
        Collections.addAll(words, Content.split("\\s+"));
        /* for(String word : Content.split("\\s+")) {
            words.add(word);
        }
        */
        Map<String, Integer> WordCount = new HashMap<>();
        for (String word : words) {
            if (!WordCount.containsKey(word)) {
                WordCount.put(word, 1);
            } else {
                WordCount.put(word, WordCount.get(word) + 1);
            }
        }
        return WordCount;
    }

    public static Map<Character, Integer> CountCharacters(String Content) {
        Map<Character, Integer> CharacterCount = new HashMap<>();
        for (int i = 0; i < Content.length(); i++) {
            char c = Content.charAt(i);
            if (c == ' '){
                continue;
            }
            if (!CharacterCount.containsKey(c)) {
                CharacterCount.put(c, 1);
            }else {
                CharacterCount.put(c, CharacterCount.get(c) + 1);
            }
        }
        return CharacterCount;
    }

}
