import java.util.Map;

public class Main {
    public static void main(String[] args) {

        SimpleWordDictionary simpleWordDictionary = new SimpleWordDictionary();

        simpleWordDictionary.addWord("apple");
        simpleWordDictionary.addWord("avocado");
        simpleWordDictionary.addWord("banana");
        simpleWordDictionary.addWord("cat");
        simpleWordDictionary.addWord("dog");
        simpleWordDictionary.addWord("elephant");
        simpleWordDictionary.addWord("fish");
        simpleWordDictionary.addWord("giraffe");

        simpleWordDictionary.printAll();

        simpleWordDictionary.printWords('a');
        simpleWordDictionary.printWords('c');
        simpleWordDictionary.printWords('z');
    }
}