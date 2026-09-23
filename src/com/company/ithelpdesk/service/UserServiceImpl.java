package com.company.ithelpdesk.service;

import com.company.ithelpdesk.model.user.Employee;
import com.company.ithelpdesk.model.user.ITEngineer;
import com.company.ithelpdesk.model.user.Manager;
import com.company.ithelpdesk.model.user.User;
import com.company.ithelpdesk.repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public User registerEmployee(Employee employee) {
        if(employee == null) throw new RuntimeException("Employee cannot be null");

        if(employee.getEmail() == null) throw new RuntimeException("Employee's Email cannot be null");

        if(employee.getId() <= 0 ) throw new RuntimeException("Employee's Id cannot be null");

        boolean emailExists = userRepository.userEmailExists(employee.getEmail());

        boolean userIdExists = userRepository.userIdExists(employee.getId());

        if(emailExists || userIdExists) throw new RuntimeException("Employee's email or Id already exists");

        User user = userRepository.saveUser(employee);
        return user;
    }

    @Override
    public User registerITEngineer(ITEngineer itEngineer) {
        if(itEngineer == null) throw new RuntimeException("IT Engineer cannot be null");

        if(itEngineer.getEmail() == null) throw new RuntimeException("IT Engineer's Email cannot be null");

        if(itEngineer.getId() <= 0 ) throw new RuntimeException("IT Engineer's Id cannot be null");

        boolean emailExists = userRepository.userEmailExists(itEngineer.getEmail());

        boolean userIdExists = userRepository.userIdExists(itEngineer.getId());

        if(emailExists || userIdExists) throw new RuntimeException("IT Engineer's email or Id already exists");

        User user = userRepository.saveUser(itEngineer);
        return user;
    }

    @Override
    public User registerManager(Manager manager) {
        if(manager == null) throw new RuntimeException("Manager cannot be null");

        if(manager.getEmail() == null) throw new RuntimeException("Manager's Email cannot be null");

        if(manager.getId() <= 0 ) throw new RuntimeException("Manager's Id cannot be null");

        boolean emailExists = userRepository.userEmailExists(manager.getEmail());

        boolean userIdExists = userRepository.userIdExists(manager.getId());

        if(emailExists || userIdExists) throw new RuntimeException("Manager's email or Id already exists");

        User user = userRepository.saveUser(manager);
        return user;
    }

    @Override
    public User findByUserID(long userId) {

        User user = userRepository.findUserById(userId);

        if(user == null){
            throw new RuntimeException("User Id Doesn't exist");
        }
        return user;
    }

    @Override
    public User deactivateUser(long userId) {
        if(userId <= 0) throw new RuntimeException("User Id cannot be negative");;

        return userRepository.deactivateUser(userId);
    }

    @Override
    public User activateUser(long userId) {
        if(userId <= 0) throw new RuntimeException("User Id cannot be negative");;

        return userRepository.activateUser(userId);
    }

    @Override
    public List<User> listAllUsers() {
        return userRepository.getAllUsers();
    }
}
