package com.jomo.trackzilla.jomotrackzillaapp.service;

import com.jomo.trackzilla.jomotrackzillaapp.entity.Application;
import com.jomo.trackzilla.jomotrackzillaapp.entity.Ticket;

public interface TicketService {
    Iterable<Ticket> listTickets();
    Ticket findTicket(long id);
}


