package com.irctc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.irctc.dto.TicketDTO;

public interface TicketAPIContracts {
	
	@PostMapping("/api/v1/ticket/")
	public ResponseEntity<String> bookTicket(@RequestBody TicketDTO ticketDTO);
	
	@GetMapping("/api/v1/ticket/{ticketId}")
	public ResponseEntity<TicketDTO> getTicket(@PathVariable Long ticketId);
	
	@PutMapping("/api/v1/ticket/{ticketId}")
	public ResponseEntity<TicketDTO> updateTicket(@PathVariable Long ticketId , @RequestBody TicketDTO ticketDTO );
	
	@DeleteMapping("/api/v1/ticket/{ticketId}")
	public ResponseEntity<String> cancelTicket(@PathVariable Long ticketId);


}
