package com.jomo.trackzilla.jomotrackzillaapp.service;

import com.jomo.trackzilla.jomotrackzillaapp.entity.Ticket;
import com.jomo.trackzilla.jomotrackzillaapp.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Iterable<Ticket> listTickets() {
        return ticketRepository.findAll();
    }

}
