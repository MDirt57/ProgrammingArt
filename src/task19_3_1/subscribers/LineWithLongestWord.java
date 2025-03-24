package task19_3_1.subscribers;

public class LineWithLongestWord extends LongestWord{

    private String lineWithLongestWord = "";

    public String getLineWithLongestWord() {
        return lineWithLongestWord;
    }

    @Override
    public void update(String context) {
        String oldWord = super.getLongestWord();
        super.update(context);
        if (!oldWord.equals(super.getLongestWord())){
            lineWithLongestWord = context;
        }
    }
}
