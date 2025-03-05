package task14_3_1.handlers;

public interface Handler {

    void setNext(Handler next);
    void handle(Account account);

}
