package task17_3_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Chat implements Mediator {

    private ArrayList<User> users = new ArrayList<>();

    public void addUsers(User... users){
        this.users.addAll(Arrays.asList(users));
    }

    @Override
    public void broadcastAll(User sender, String message) {
        for (User user: users){
            user.receiveMassage(message, getUserId(sender));
        }
    }

    private String getUserId(User user){
        String userName = "";
        if (user instanceof ConcreteUser){
            ConcreteUser senderUser =  (ConcreteUser) user;
            userName = senderUser.getId();
        }
        return userName;
    }

    @Override
    public void broadcastToOne(User fromUser, String toUser, String message) {
        for (User user: users){
            if (Objects.equals(toUser, getUserId(user))){
                user.receiveMassage(message, getUserId(fromUser));
                break;
            }
        }
    }
}
