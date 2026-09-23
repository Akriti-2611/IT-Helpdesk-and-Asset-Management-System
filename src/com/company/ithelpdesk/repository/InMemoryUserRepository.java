package com.company.ithelpdesk.repository;

import com.company.ithelpdesk.model.user.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryUserRepository implements UserRepository{

    private Map<Long, User> users = new HashMap<Long, User>();

    @Override
    public User saveUser(User user) {

        if(user == null)
            return null;
        users.put(user.getId(), user);
        return user;
    }

    @Override
    public User findUserById(long userId) {
        if(userId <= 0)
            return null;
        return users.get(userId);
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    @Override
    public boolean userIdExists(long userId) {
        if(userId <= 0)
            return false;
        return users.containsKey(userId);
    }

    @Override
    public boolean userEmailExists(String email) {
        if(email == null || email.isBlank())
            return false;

        for(User user : users.values()){
            if(email.equalsIgnoreCase(user.getEmail()))
                return true;
        }

        return false;
    }

    @Override
    public User activateUser(long userId) {
        if(userId <= 0) return null;

        User user = findUserById(userId);

        if(user == null) return null;

        user.setActive(true);
        return user;
    }

    @Override
    public User deactivateUser(long userId) {
        if(userId <= 0) return null;

        User user = findUserById(userId);

        if(user ==  null) return null;

        user.setActive(false);
        return user;
    }
}
