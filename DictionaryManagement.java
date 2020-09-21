package Diractory;

import java.util.Scanner;

public class DictionaryManagement {

    private static Scanner scanner = new Scanner(System.in);

    public void insertFromCommandline() {
        String word_target = scanner.nextLine();
        String word_explain = scanner.nextLine();
        Word word = new Word(word_target, word_explain);
        Dictionary.addWord(word);
    }

    public void showAllWords() {
        System.out.println("No\t|English\t|Vietnamese");
        int i = 1;
        for (Word word : Dictionary.getDictionary()) {
            System.out.println(i + "\t|" + word.word_target + "\t\t|" + word.word_explain);
        }
    }
}
