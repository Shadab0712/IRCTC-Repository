package com.irctc.repository;

import com.irctc.model.Ticket;

public interface TicketRepositoryContracts {

	public boolean bookIntoTicketTable(Ticket ticket);

	public Ticket getFromTicketTable(Long ticketId);

	public Ticket updateIntoTicketTable(Long ticketId, Ticket ticket);

	public boolean cancelFromTicketTable(Long ticketId);

}
