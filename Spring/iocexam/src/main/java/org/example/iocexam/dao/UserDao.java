package org.example.iocexam.dao;

import org.example.iocexam.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao {
    public User getUser(String email);
    public List<User> getUsers();
    public void addUser(User user);
}
