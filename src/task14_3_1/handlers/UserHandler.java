package task14_3_1.handlers;

import java.util.Map;

public class UserHandler extends BaseHandlerWithStorage {

    public UserHandler(Map<String, String> storage) {
        super(storage);
    }

    @Override
    public void handle(Account account){
        if (account.getAccessType() == Account.AccessType.User){
            String login = account.getLogin();
            if (account.getPassword().equals(storage.get(login))) {
                System.out.println("User access provided: " + login);
            } else {
                System.out.println("Access denied: " + login);
            }
        } else{
            super.handle(account);
        }
    }


}