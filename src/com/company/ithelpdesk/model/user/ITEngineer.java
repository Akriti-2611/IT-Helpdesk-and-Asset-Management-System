package com.company.ithelpdesk.model.user;

import com.company.ithelpdesk.enums.UserRole;

public class ITEngineer extends User{
    public ITEngineer(long id, String name, String email, String phone, boolean active, String specialization, int maxOpenTickets) {
        super(id, name, email, phone, active);
        this.specialization = specialization;
        this.maxOpenTickets = maxOpenTickets;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getMaxOpenTickets() {
        return maxOpenTickets;
    }

    public void setMaxOpenTickets(int maxOpenTickets) {
        this.maxOpenTickets = maxOpenTickets;
    }

    private String specialization;
  //  private List<Ticket> assignedTickets;
    private int maxOpenTickets;

    @Override
    public UserRole getRole() {
        return UserRole.IT_ENGINEER;
    }

    @Override
    public void displayProfile(){
        super.displayProfile();
        System.out.println("Specialization: " + specialization);
        System.out.println("Max Open Tickets: " + maxOpenTickets);
    }
}
