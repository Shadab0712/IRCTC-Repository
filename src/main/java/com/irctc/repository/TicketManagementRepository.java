package com.irctc.repository;

import org.springframework.data.repository.CrudRepository;

import com.irctc.model.Ticket;

public interface TicketManagementRepository extends CrudRepository<Ticket , Long> {

}
