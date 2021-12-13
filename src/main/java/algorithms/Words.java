package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return words;
    }

    public void addWord(String word) {
        String lowerCaseWord = word.toLowerCase();
        if (word.contains(" ")) {
            throw new IllegalArgumentException("It should be one word!");
        } else if (!lowerCaseWord.equals(word)) {
            throw new IllegalArgumentException("Word should be lower case!");
        } else if (word.equals(word.toLowerCase())) {
            words.add(word);
        }
    }

    public boolean isThereAWordTwice() {
        List<String> wordOne = new ArrayList<>();
        for (String s : words) {
            if (!wordOne.contains(s)) {
                wordOne.add(s);
            }
        }
        return words.size() != wordOne.size();
    }
}