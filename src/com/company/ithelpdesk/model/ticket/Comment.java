package com.company.ithelpdesk.model.ticket;

import com.company.ithelpdesk.model.user.User;

import java.util.Date;

public class Comment {
    private long id;
    private String description;
    private Ticket ticket;
    private User commentedBy;
    private Date commentedOn;

    public Comment(long id, String description, Ticket ticket, User commentedBy, Date commentedOn) {
        this.id = id;
        this.description = description;
        this.ticket = ticket;
        this.commentedBy = commentedBy;
        this.commentedOn = commentedOn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public User getCommentedBy() {
        return commentedBy;
    }

    public void setCommentedBy(User commentedBy) {
        this.commentedBy = commentedBy;
    }

    public Date getCommentedOn() {
        return commentedOn;
    }

    public void setCommentedOn(Date commentedOn) {
        this.commentedOn = commentedOn;
    }
}
