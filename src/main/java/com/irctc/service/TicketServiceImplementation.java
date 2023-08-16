package com.irctc.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.dto.TicketDTO;
import com.irctc.model.Ticket;
import com.irctc.repository.TicketRepositoryImplementation;

@Service
public class TicketServiceImplementation implements TicketServiceContracts {

	@Autowired
	private TicketRepositoryImplementation repository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public boolean bookTicket(TicketDTO ticketDTO) {
		Ticket createsTicket = modelMapper.map(ticketDTO, Ticket.class);
		repository.bookIntoTicketTable(createsTicket);
		return true;

	}

	@Override
	public TicketDTO getTicket(Long ticketId) {
		Ticket getsTicket = repository.getFromTicketTable(ticketId);
		TicketDTO ticketDTO = modelMapper.map(getsTicket, TicketDTO.class);
		return ticketDTO;
	}

	@Override
	public TicketDTO updateTicket(Long ticketId, TicketDTO ticketDTO) {
		Ticket getRecord = repository.getFromTicketTable(ticketId);

		getRecord.setMobileNumber(getRecord.getMobileNumber());

		Ticket updatedValue = repository.updateIntoTicketTable(ticketId, getRecord);
		TicketDTO newTicketDTO = modelMapper.map(updatedValue, TicketDTO.class);
		return newTicketDTO;
	}

	@Override
	public boolean cancelTicket(Long ticketId) {
		repository.cancelFromTicketTable(ticketId);
		return true;
	}

}
