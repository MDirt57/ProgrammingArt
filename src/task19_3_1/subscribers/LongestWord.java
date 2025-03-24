package task19_3_1.subscribers;

import java.util.Arrays;
import java.util.List;

public class LongestWord implements Subscriber{

    private String longestWord = "";

    @Override
    public void update(String context) {
        List<String> words = Arrays.asList(context.trim().split("\\s+"));
        for (String word: words){
            if (word.length() > longestWord.length()){
                longestWord = word;
            }
        }
    }

    public String getLongestWord() {
        return longestWord;
    }
}
