package com.jomo.trackzilla.jomotrackzillaapp.controller;

import com.jomo.trackzilla.jomotrackzillaapp.service.ApplicationService;
import com.jomo.trackzilla.jomotrackzillaapp.service.OwnerService;
import com.jomo.trackzilla.jomotrackzillaapp.service.ReleaseService;
import com.jomo.trackzilla.jomotrackzillaapp.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrackzillaController {
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
    public String retrieveApplications(Model model){
        model.addAttribute("applications", applicationService.listApplications());
        return "applications";
    }

    @GetMapping("/tickets")
    public String retrieveTickets(Model model){
        model.addAttribute("tickets", ticketService.listTickets());
        return "tickets";
    }

    @GetMapping("/releases")
    public String retrieveReleases(Model model){
        model.addAttribute("releases", releaseService.listReleases());
        return "releases";
    }

    @GetMapping("/owners")
    public String retrieveOwners(Model model){
        model.addAttribute("owners", ownerService.listOwners());
        return "owners";
    }
}
