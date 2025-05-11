package db;

import model.User;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private final List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users); // Возвращаем копию
    }

    public User getUserById(long id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public boolean deleteUser(User user) {
        return users.remove(user);
    }

    public void clear() {
        users.clear();
    }
}