package Diractory;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    private static List<Word> dictionary = new ArrayList<Word>();

    public static List<Word> getDictionary() {
        return dictionary;
    }

    public static void setDictionary(List<Word> dictionary) {
        Dictionary.dictionary = dictionary;
    }

    public static void addWord(Word word) {
        dictionary.add(word);
    }
}
