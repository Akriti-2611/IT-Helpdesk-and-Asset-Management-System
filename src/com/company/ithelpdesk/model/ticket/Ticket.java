package com.company.ithelpdesk.model.ticket;

import com.company.ithelpdesk.enums.Category;
import com.company.ithelpdesk.enums.Priority;
import com.company.ithelpdesk.enums.Status;
import com.company.ithelpdesk.model.user.Employee;
import com.company.ithelpdesk.model.user.ITEngineer;
import java.util.List;

public class Ticket {
    private long id;
    private String title;
    private String description;
    private Category category;
    private Status status;
    private Priority priority;
    private Employee createdBy;
    private ITEngineer assignedTo;
    private List<Comment> comments;
    private List<TicketHistory> ticketHistory;

    public Ticket(long id, String title, String description, Category category, Status status, Priority priority, Employee createdBy, ITEngineer assignedTo, List<Comment> comments, List<TicketHistory> ticketHistory) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.status = status;
        this.priority = priority;
        this.createdBy = createdBy;
        this.assignedTo = assignedTo;
        this.comments = comments;
        this.ticketHistory = ticketHistory;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Employee getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Employee createdBy) {
        this.createdBy = createdBy;
    }

    public ITEngineer getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(ITEngineer assignedTo) {
        this.assignedTo = assignedTo;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<TicketHistory> getTicketHistory() {
        return ticketHistory;
    }

    public void setTicketHistory(List<TicketHistory> ticketHistory) {
        this.ticketHistory = ticketHistory;
    }

}
