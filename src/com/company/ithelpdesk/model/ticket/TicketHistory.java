package com.company.ithelpdesk.model.ticket;

import com.company.ithelpdesk.enums.Status;

import java.util.Date;

public class TicketHistory {

    private long id;
    private Ticket ticket;
    private Status status;
    private Comment comment;
    private Date createdOn;

    public TicketHistory(long id, Ticket ticket, Status status, Comment comment, Date createdOn) {
        this.id = id;
        this.ticket = ticket;
        this.status = status;
        this.comment = comment;
        this.createdOn = createdOn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
