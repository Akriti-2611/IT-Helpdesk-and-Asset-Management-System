package com.company.ithelpdesk.service;

import com.company.ithelpdesk.model.user.Employee;
import com.company.ithelpdesk.model.user.ITEngineer;
import com.company.ithelpdesk.model.user.Manager;
import com.company.ithelpdesk.model.user.User;

import java.util.List;

public interface UserService {

    User registerEmployee(Employee employee);

    User registerITEngineer(ITEngineer itEngineer);

    User registerManager(Manager manager);

    User findByUserID(long userId);

    User deactivateUser(long userId);

    User activateUser(long userId);

    List<User> listAllUsers();
}
