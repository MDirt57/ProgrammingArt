package task14_3_1.handlers;

import java.util.Map;

public class AdminHandler extends BaseHandlerWithStorage {

    public AdminHandler (Map<String, String> storage) {
        super(storage);
    }

    @Override
    public void handle(Account account){
        if (account.getAccessType() == Account.AccessType.Administrator){
            String login = account.getLogin();
            String password = account.getPassword();
            if (password.equals(storage.get(login)) && password.length() >= 8) {
                System.out.println("Administrator access provided: " + login);
            } else {
                System.out.println("Access denied: " + login);
            }
        } else{
            super.handle(account);
        }
    }


}