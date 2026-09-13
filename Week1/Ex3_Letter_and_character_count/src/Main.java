
import java.util.Map;
public class Main {
    static void main(String[] args) {
        String Content = Input.InputContent();
        Map<String, Integer> WordCount = Function.CountWords(Content);
        System.out.println(WordCount);
        Map<Character, Integer> CharacterCount = Function.CountCharacters(Content);
        System.out.println(CharacterCount);
    }
}
