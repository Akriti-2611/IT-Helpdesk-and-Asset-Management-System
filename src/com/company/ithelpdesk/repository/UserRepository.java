package com.company.ithelpdesk.repository;

import com.company.ithelpdesk.model.user.User;

import java.util.List;

public interface UserRepository {

    User saveUser(User user);

    User findUserById(long userId);

    List<User> getAllUsers();

    boolean userIdExists(long userId);

    boolean userEmailExists(String email);
}
