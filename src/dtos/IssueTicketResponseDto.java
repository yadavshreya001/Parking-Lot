package dtos;

import models.Ticket;

public class IssueTicketResponseDto {
    private Ticket ticket;
    private ResponseStatus responseStatus;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
<<<<<<< HEAD
}
=======

>>>>>>> c57483d690ed78fc282c5f6b7591e10d844eea3a
