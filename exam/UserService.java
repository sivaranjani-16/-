package exam;
import java.util.*;

public class UserService {
    private Map<String,User> users = new HashMap<>();

    public UserService() {
        users.put("user1",new User("user1","pass1","Student A"));
        users.put("user2",new User("user2","pass2","Student B"));
    }

    public User login(String username, String password) {
        User user=users.get(username);
        if (user!=null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public void updateProfile(String username, String newProfile) {
        User user=users.get(username);
        if (user!=null) {
            user.setProfile(newProfile);
        }
    }

    public void updatePassword(String username, String newPassword) {
        User user=users.get(username);
        if (user!=null) {
            user.setPassword(newPassword);
        }
    }
}