package com.irctc.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.irctc.model.Ticket;

@Repository
public class TicketRepositoryImplementation implements TicketRepositoryContracts {

	@Autowired
	private TicketManagementRepository repository;

	@Override
	public boolean bookIntoTicketTable(Ticket ticket) {
		repository.save(ticket);
		return true;
	}

	@Override
	public Ticket getFromTicketTable(Long ticketId) {
		Optional<Ticket> ticketOptional = repository.findById(ticketId);
		if (ticketOptional.isPresent()) {
			Ticket getTicket = ticketOptional.get();
			return getTicket;

		}
		return null;
	}

	@Override
	public Ticket updateIntoTicketTable(Long ticketId, Ticket ticket) {
		Ticket updateTicket = repository.save(ticket);
		return updateTicket;
	}

	@Override
	public boolean cancelFromTicketTable(Long ticketId) {
		repository.deleteById(ticketId);
		return true;
	}

}
