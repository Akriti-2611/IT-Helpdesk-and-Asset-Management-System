package com.company.ithelpdesk.model.user;

import com.company.ithelpdesk.enums.UserRole;

import java.util.List;

public class Manager extends User{
    public Manager(long id, String name, String email, String phone, boolean active, String department, List<User> teamMembers) {
        super(id, name, email, phone, active);
        this.department = department;
        this.teamMembers = teamMembers;
    }

    private String department;
    private List<User> teamMembers;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<User> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(List<User> teamMembers) {
        this.teamMembers = teamMembers;
    }

    @Override
    public UserRole getRole() {
        return UserRole.MANAGER;
    }

    @Override
    public void displayProfile(){
        super.displayProfile();

        System.out.println("Department: " + department);

        System.out.println("Team Members: ");
        for(User user : teamMembers){
            System.out.println(user.getName());
        }
    }
}
