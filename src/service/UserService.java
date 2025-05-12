package service;

import model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getById(long id);
    User update (long id, User user);
    String delete (User user);
}
