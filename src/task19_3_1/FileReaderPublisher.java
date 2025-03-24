package task19_3_1;

import task19_3_1.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class FileReaderPublisher extends FileReader implements Publisher{

    private List<Subscriber> subscribers = new ArrayList<>();

    public FileReaderPublisher(String filePath) {
        super(filePath);
    }

    @Override
    void onLineRead(String line){
        for (Subscriber subscriber : subscribers) {
            subscriber.update(line);
        }

    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
}
