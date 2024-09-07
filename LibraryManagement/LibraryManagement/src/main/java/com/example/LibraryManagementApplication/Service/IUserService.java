package com.example.LibraryManagementApplication.Service;

import com.example.LibraryManagementApplication.Model.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();

    User getUserById(String userId);

    User createUser(User user);

    User updateUser(String userId, User user);

    void deleteUser(String userId);
}
