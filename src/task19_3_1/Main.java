package task19_3_1;

import task19_3_1.subscribers.LineWithLongestWord;
import task19_3_1.subscribers.LongestLine;
import task19_3_1.subscribers.LongestWord;
import task19_3_1.subscribers.WordCounter;

public class Main {

    public static void main(String[] args) {
//        FileReader fileReader = new FileReader("resources/input01.txt");
        FileReaderPublisher fileReader = new FileReaderPublisher("resources/input01.txt");

        LongestLine sub1 = new LongestLine();
        LongestWord sub2 = new LongestWord();
        WordCounter sub3 = new WordCounter();
        LineWithLongestWord sub4 = new LineWithLongestWord();

        fileReader.addSubscriber(sub1);
        fileReader.addSubscriber(sub2);
        fileReader.addSubscriber(sub3);
        fileReader.addSubscriber(sub4);

        fileReader.read();

        System.out.printf("Longest line is: %s\n", sub1.getLongestLine());
        System.out.printf("Longest word is: %s\n", sub2.getLongestWord());
        System.out.printf("Words number in the file is: %s\n", sub3.getWordCounter());
        System.out.printf("Line with the longest word is: %s\n", sub4.getLineWithLongestWord());

    }

}
