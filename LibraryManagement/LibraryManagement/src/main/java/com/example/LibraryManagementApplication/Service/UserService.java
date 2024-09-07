package com.example.LibraryManagementApplication.Service;

import com.example.LibraryManagementApplication.Model.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {
    private List<User> users = new ArrayList<>();

    @Override
    public List<User> getAllUsers() {
        return users;
    }


    @Override
    public User getUserById(String userId) {
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User createUser(User user) {
        users.add(user);
        return user;
    }

    @Override
    public User updateUser(String userId, User user) {
        for (User u : users) {
            if (u.getId().equals(userId)) {
                u.setName(user.getId());
                u.setName(user.getName());
                u.setAge(user.getAge());
                return u;
            }
        }
        return null;
    }

    @Override
    public void deleteUser(String userId) {
        users.removeIf(user -> user.getId().equals(userId));
    }
}
