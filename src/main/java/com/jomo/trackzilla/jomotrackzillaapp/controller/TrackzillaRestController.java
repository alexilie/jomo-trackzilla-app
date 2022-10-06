package com.jomo.trackzilla.jomotrackzillaapp.controller;

import com.jomo.trackzilla.jomotrackzillaapp.entity.Application;
import com.jomo.trackzilla.jomotrackzillaapp.entity.Owner;
import com.jomo.trackzilla.jomotrackzillaapp.entity.Release;
import com.jomo.trackzilla.jomotrackzillaapp.entity.Ticket;
import com.jomo.trackzilla.jomotrackzillaapp.exception.ApplicationNotFoundException;
import com.jomo.trackzilla.jomotrackzillaapp.exception.OwnerNotFoundException;
import com.jomo.trackzilla.jomotrackzillaapp.exception.ReleaseNotFoundException;
import com.jomo.trackzilla.jomotrackzillaapp.exception.TicketNotFoundException;
import com.jomo.trackzilla.jomotrackzillaapp.service.ApplicationService;
import com.jomo.trackzilla.jomotrackzillaapp.service.OwnerService;
import com.jomo.trackzilla.jomotrackzillaapp.service.ReleaseService;
import com.jomo.trackzilla.jomotrackzillaapp.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api/v1/trackzilla")
public class TrackzillaRestController {
    private ApplicationService applicationService;
    private TicketService ticketService;
    private ReleaseService releaseService;
    private OwnerService ownerService;

    @Autowired
    public void setApplicationService(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @Autowired
    public void setTicketService(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @Autowired
    public void setReleaseService(ReleaseService releaseService) {
        this.releaseService = releaseService;
    }

    @Autowired
    public void setOwnerService(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping("/applications")
    public ResponseEntity<List<Application>> getAllApplications() {
        List<Application> list = (List<Application>) applicationService.listApplications();
        return new ResponseEntity<List<Application>>(list, HttpStatus.OK);
    }

    @GetMapping("/applications/{id}")
    public ResponseEntity<Application> getApplication(@PathVariable("id") Integer id) {
        try {
            return new ResponseEntity<Application>(applicationService.findApplication(id), HttpStatus.OK);
        } catch (ApplicationNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Application Not Found");
        }
    }

    @GetMapping("/tickets")
    public ResponseEntity<List<Ticket>> getAllTickets() {
        List<Ticket> list = (List<Ticket>) ticketService.listTickets();
        return new ResponseEntity<List<Ticket>>(list, HttpStatus.OK);
    }

    @GetMapping("/tickets/{id}")
    public ResponseEntity<Ticket> getTicket(@PathVariable("id") Integer id) {
        try {
            return new ResponseEntity<Ticket>(ticketService.findTicket(id), HttpStatus.OK);
        } catch (TicketNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Ticket Not Found");
        }
    }

    @GetMapping("/releases")
    public ResponseEntity<List<Release>> getAllReleases() {
        List<Release> list = (List<Release>) releaseService.listReleases();
        return new ResponseEntity<List<Release>>(list, HttpStatus.OK);
    }

    @GetMapping("/releases/{id}")
    public ResponseEntity<Release> getRelease(@PathVariable("id") Integer id) {
        try {
            return new ResponseEntity<Release>(releaseService.findRelease(id), HttpStatus.OK);
        } catch (ReleaseNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Release Not Found");
        }
    }

    @GetMapping("/owners")
    public ResponseEntity<List<Owner>> getAllOwners() {
        List<Owner> list = (List<Owner>) ownerService.listOwners();
        return new ResponseEntity<List<Owner>>(list, HttpStatus.OK);
    }

    @GetMapping("/owners/{id}")
    public ResponseEntity<Owner> Owner(@PathVariable("id") Integer id) {
        try {
            return new ResponseEntity<Owner>(ownerService.findOwner(id), HttpStatus.OK);
        } catch (OwnerNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Owner Not Found");
        }
    }
}
