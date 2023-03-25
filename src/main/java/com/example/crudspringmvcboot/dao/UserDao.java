package com.example.crudspringmvcboot.dao;


import com.example.crudspringmvcboot.model.User;

import java.util.List;

public interface UserDao {

    public List<User> showAllUsers();
    public User show(long id);
    public void save(User user);
    public void update(User updatedUser);
    public void delete(User user);
}
