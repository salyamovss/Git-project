package dao.daoImpl;

import dao.UserDao;
import db.Database;
import model.User;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private final Database database = new Database();
    private long nextId = 1;

    @Override
    public List<User> getAllUsers() {
        return database.getAllUsers();
    }

    @Override
    public User getById(long id) {
        return database.getUserById(id);
    }

    @Override

    public void addUser(User user) {
        user.setId(nextId++);
        database.addUser(user);
    }

    @Override
    public String delete(User user) {
        database.deleteUser(user);
        return "Success!";
    }
}
