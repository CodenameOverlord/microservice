package com.lcwd.user.service.UserService.services;

import com.lcwd.user.service.UserService.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUser(String userId);

    Boolean deleteUser(String userId);
    User updateUser(String userId, User user);

}
