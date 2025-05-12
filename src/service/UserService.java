package service;

import model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getById(long id);
    void addUser(User user);
    String delete (User user);
}
