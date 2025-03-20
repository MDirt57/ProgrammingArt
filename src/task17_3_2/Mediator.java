package task17_3_2;

public interface Mediator {

    void broadcastAll(User user, String message);

    void broadcastToOne(User fromUser, String toUser, String message);
}
