package task19_3_1.subscribers;

import java.util.Arrays;
import java.util.List;

public class WordCounter implements Subscriber{

    private int wordCounter = 0;

    public int getWordCounter() {
        return wordCounter;
    }

    public void restoreCounter(){
        wordCounter = 0;
    }

    @Override
    public void update(String context) {
        List<String> words = Arrays.asList(context.trim().split("\\s+"));
        wordCounter += words.size();
    }

}
