package task19_3_1.subscribers;

public class LongestLine implements Subscriber {

    private String longestLine = "";

    public String getLongestLine() {
        return longestLine;
    }

    @Override
    public void update(String context) {
        if (context.length() > longestLine.length()){
            longestLine = context;
        }
    }

}
