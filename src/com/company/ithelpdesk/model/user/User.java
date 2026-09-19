package com.company.ithelpdesk.model.user;

import com.company.ithelpdesk.enums.UserRole;

public abstract class User {
    private long id;
    private String name;
    private String email;
    private String phone;
    private boolean active;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public User(long id, String name, String email, String phone, boolean active) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.active = active;
    }

    public abstract UserRole getRole();

    public void displayProfile(){
        System.out.println("Id:"+ id);
        System.out.println("Name:"+ name);
        System.out.println("Email:"+ email);
        System.out.println("Phone:"+ phone);
        System.out.println("Active:"+ active);

    }
}
