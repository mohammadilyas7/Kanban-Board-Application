package com.capstone.service;

import com.capstone.model.User;

import java.util.List;

public interface Userservice {
    public User registerUser(User user);
//    public User findByUsernameAndPasswordCheck(String username,String password)throws UserNotFoundException;
    public List<User> getAllUsers();
}
