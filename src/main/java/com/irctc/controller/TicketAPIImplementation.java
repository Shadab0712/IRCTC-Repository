package com.irctc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.irctc.dto.TicketDTO;
import com.irctc.service.TicketServiceImplementation;

public class TicketAPIImplementation implements TicketAPIContracts {

	@Autowired
	private TicketServiceImplementation service;

	@PostMapping("/api/v1/ticket/")
	public ResponseEntity<String> bookTicket(@RequestBody TicketDTO ticketDTO) {
		service.bookTicket(ticketDTO);
		return new ResponseEntity<String>("Ticket Created", HttpStatus.CREATED);

	}

	@GetMapping("/api/v1/ticket/{ticketId}")
	public ResponseEntity<TicketDTO> getTicket(@PathVariable Long ticketId) {
		TicketDTO getTicket = service.getTicket(ticketId);
		return new ResponseEntity<>(getTicket, HttpStatus.OK);

	}

	@PutMapping("/api/v1/ticket/{ticketId}")
	public ResponseEntity<TicketDTO> updateTicket(@PathVariable Long ticketId, @RequestBody TicketDTO ticketDTO) {
		TicketDTO updateTicket = service.updateTicket(ticketId, ticketDTO);
		return new ResponseEntity<>(updateTicket, HttpStatus.OK);

	}

	@DeleteMapping("/api/v1/ticket/{ticketId}")
	public ResponseEntity<String> cancelTicket(@PathVariable Long ticketId) {
		service.cancelTicket(ticketId);
		return new ResponseEntity<String>("Ticket cancelled", HttpStatus.OK);

	}
}
