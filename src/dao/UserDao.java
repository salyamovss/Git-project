package dao;

import model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getById(long id);
    void addUser(User user);

}
