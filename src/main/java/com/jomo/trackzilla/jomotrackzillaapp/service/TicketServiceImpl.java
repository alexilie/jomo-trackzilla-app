package com.jomo.trackzilla.jomotrackzillaapp.service;

import com.jomo.trackzilla.jomotrackzillaapp.entity.Ticket;
import com.jomo.trackzilla.jomotrackzillaapp.exception.TicketNotFoundException;
import com.jomo.trackzilla.jomotrackzillaapp.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Iterable<Ticket> listTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket findTicket(long id)  {
        Optional<Ticket> optionalTicket = ticketRepository.findById(id);

        if(optionalTicket.isPresent())
            return optionalTicket.get();
        else
            throw new TicketNotFoundException("Ticket Not Found");
    }

}
