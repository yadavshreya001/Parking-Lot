package dtos;
import models.Ticket;

/**
 * Data Transfer Object (DTO) for responding to a parking ticket issuance request.
 * This class encapsulates the result of the ticket issuance process, including the
 * generated ticket details and the response status of the operation.
 */
public class IssueTicketResponseDto {
    private Ticket ticket;   // The issued parking ticket containing details like ticket ID, vehicle number, etc.
    private ResponseStatus responseStatus;   // The status of the response (e.g., SUCCESS, FAILURE, PARKING_FULL)

    // Getter and Setter for each field
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
}
