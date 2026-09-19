package com.company.ithelpdesk.model.user;

import com.company.ithelpdesk.enums.UserRole;

public class Employee extends User {

    private String employeeCode;
    private String department;
    //    private List<Ticket> tickets;
    //    private List<Asset> assets;

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(long id, String name, String email, String phone, boolean active, String employeeCode, String department) {
        super(id, name, email, phone, active);
        this.employeeCode = employeeCode;
        this.department = department;
    }

    @Override
    public UserRole getRole() {
        return UserRole.EMPLOYEE;
    }

    @Override
    public void displayProfile(){
        super.displayProfile();

        System.out.println("Employee Code: " + employeeCode);
        System.out.println("Department: " + department);
    }

}
