package com.jomo.trackzilla.jomotrackzillaapp.repository;

import com.jomo.trackzilla.jomotrackzillaapp.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
