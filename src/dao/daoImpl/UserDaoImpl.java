package dao.daoImpl;

import dao.UserDao;
import db.Database;
import model.User;

import java.util.List;

public class UserDaoImpl implements UserDao {
    Database database = new Database();

    @Override
    public List<User> getAllUsers() {
        return database.getAllUsers();
    }

    @Override
    public User getById(long id) {
        return database.getUserById(id);
    }
}
