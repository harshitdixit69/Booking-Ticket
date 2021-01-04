package com.MovieBooking.cinematic.service;

import java.util.List;

import com.MovieBooking.cinematic.model.User;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long user_id);

    User pushUser(User newUser);

    User updateUser(User updatedUser, Long user_id);

    void deleteUserById(Long user_id);
}
