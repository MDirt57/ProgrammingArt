package task19_3_1;

import task19_3_1.subscribers.Subscriber;

public interface Publisher {

    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);

}
