package dao;

import model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getById(long id);
    User update (long id, User newUser);
    String delete (User user);
}
