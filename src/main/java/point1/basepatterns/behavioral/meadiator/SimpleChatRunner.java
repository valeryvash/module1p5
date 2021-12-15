package point1.basepatterns.behavioral.meadiator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User u1 = new SimpleUser(chat, "user 1");
        User u2 = new SimpleUser(chat, "user 2");

        chat.setAdmin((Admin) admin);
        chat.addUserToChat(u1);
        chat.addUserToChat(u2);

        u1.sendMessage("Hello everybody!");
//        u2.getMessage();
        admin.sendMessage("Roger that. I am admin");
    }
}
