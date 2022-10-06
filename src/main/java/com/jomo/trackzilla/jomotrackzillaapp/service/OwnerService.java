package com.jomo.trackzilla.jomotrackzillaapp.service;

import com.jomo.trackzilla.jomotrackzillaapp.entity.Owner;
import com.jomo.trackzilla.jomotrackzillaapp.entity.Ticket;

public interface OwnerService {
    Iterable<Owner> listOwners();
    Owner findOwner(long id);
}


