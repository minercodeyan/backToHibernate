package dao;

import model.User;

import java.util.List;

public interface UserDao {

    User findById(int id);
    List<User> findAll();
    void deleteById(User user);
    void addUser(User user);
}
