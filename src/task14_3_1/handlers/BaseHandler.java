package task14_3_1.handlers;

import java.util.HashMap;

public class BaseHandler implements Handler {

    private Handler next;

    @Override
    public void setNext(Handler next) { this.next = next; }

    @Override
    public void handle(Account account){
        if (next != null){
            next.handle(account);
        }
    }


}