package com.irctc.service;

import com.irctc.dto.TicketDTO;

public interface TicketServiceContracts {

	public boolean bookTicket(TicketDTO ticketDTO);

	public TicketDTO getTicket(Long ticketId);

	public TicketDTO updateTicket(Long ticketId, TicketDTO ticketDTO);

	public boolean cancelTicket(Long ticketId);

}
