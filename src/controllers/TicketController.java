package controllers;
import dtos.IssueTicketRequestDto;
import dtos.IssueTicketResponseDto;
import dtos.ResponseStatus;
import models.Ticket;
import services.TicketService;

/**
 * Controller class responsible for handling requests related to ticket issuance.
 */
public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {  // Constructor for TicketController.
        this.ticketService = ticketService;
    }

    /**
     * Issues a parking ticket based on the request data.
     * @param requestDto - Data transfer object containing gate ID, vehicle number, owner name, and vehicle type.
     * @return IssueTicketResponseDto - Response DTO containing the issued ticket and response status.
     */
    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto requestDto) {
        IssueTicketResponseDto responseDto = new IssueTicketResponseDto();
        try {
            // Call the service to issue a ticket with the provided details
            Ticket ticket = ticketService.issueTicket(requestDto.getGateId(),
                    requestDto.getVehicleNumber(),
                    requestDto.getOwnerName(),
                    requestDto.getVehicleType());

            responseDto.setTicket(ticket);
            // Set the ticket and response status to SUCCESS
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            // Handle any exception and set the response status to FAILURE
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return responseDto;
    }
}