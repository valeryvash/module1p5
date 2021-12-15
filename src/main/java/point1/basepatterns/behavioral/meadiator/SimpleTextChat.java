package point1.basepatterns.behavioral.meadiator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {
    Admin admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (u!= user) {
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
