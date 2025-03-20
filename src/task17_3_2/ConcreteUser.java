package task17_3_2;

public class ConcreteUser implements User {

    final private String userId;
    private Chat chat;

    public ConcreteUser(String userId) {
        this.userId = userId;
    }

    public void setChat(Chat chat){
        this.chat = chat;
    }

    public String getId(){
        return userId;
    }

    @Override
    public void sendMessageAll(String message) {
        chat.broadcastAll(this, message);
    }

    @Override
    public void sendMessage(String message, String userTo) {
        chat.broadcastToOne(this, userTo, message);
    }

    @Override
    public void receiveMassage(String message, String userFrom) {
        System.out.println("User " + userId + " receives message: " + message + " from user " + userFrom);
    }
}
