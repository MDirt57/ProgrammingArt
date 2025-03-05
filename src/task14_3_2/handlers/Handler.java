package task14_3_2.handlers;

public interface Handler {

    void setNext(Handler next);
    void handle(String filePath);

}
