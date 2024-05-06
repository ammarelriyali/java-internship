import java.util.*;

public class SimpleWordDictionary {
    private  Map<Character, List<String>> wordDictionary ;
    SimpleWordDictionary() {
        wordDictionary = new TreeMap<>();
        for (char i = 'a'; i <= 'z'; i++) {
            wordDictionary.put(i,new ArrayList<>());
        }
    }
    public void addWord(String word) {
        if (!word.isBlank()) {
            char firstChar = Character.toLowerCase(word.charAt(0));
            if (wordDictionary.containsKey(firstChar)) {
                wordDictionary.get(firstChar).add(word);
                Collections.sort(wordDictionary.get(firstChar));
            }
        }
    }

    public void printAll() {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c + ": " + wordDictionary.get(c));
        }
    }
    public void printWords(char c) {
        System.out.println(getWords(c));
    }
    private String getWords(char c) {
        String result = "";
        if (c <= 'z' && c >= 'a') {
            for (String word : wordDictionary.get(c)) {
                result = word + ", ";
            }
        }
        return  result.equals("") ? "this is empty list" : result;
    }
}
