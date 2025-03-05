package task14_3_1.handlers;

import java.util.HashMap;

public class GuestHandler extends BaseHandler {


    @Override
    public void handle(Account account){
        if (account.getAccessType() == Account.AccessType.Guest){
            System.out.println("Guest access provided!");
        } else{
            super.handle(account);
        }
    }


}
