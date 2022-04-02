package com.example.springbootdemo.Service;

import com.example.springbootdemo.DAO.UserDAO;
import com.example.springbootdemo.Model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void addUser(String userName, String email, int age) {
        userDAO.addUser(userName, email, age);
    }

    @Override
    public User getUserById(int Id) {
        return userDAO.getUserById(Id);
    }

    @Override
    @Transactional
    public void deleteUserById(int Id) {
        userDAO.deleteUserById(Id);
    }

    @Override
    @Transactional
    public void updateUser(int Id, String userName, String email, int age) {
        userDAO.updateUser(Id, userName, email, age);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    public void addUser(User user) {
        userDAO.addUser(user);
    }
}
