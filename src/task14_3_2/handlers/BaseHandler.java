package task14_3_2.handlers;

public class BaseHandler implements Handler{

    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(String filePath) {
        if (next != null){
            next.handle(filePath);
        }else{
            System.out.println("This format is unknown!!!");
        }
    }
}
