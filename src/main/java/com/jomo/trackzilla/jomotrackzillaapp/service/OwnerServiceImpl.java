package com.jomo.trackzilla.jomotrackzillaapp.service;

import com.jomo.trackzilla.jomotrackzillaapp.entity.Owner;
import com.jomo.trackzilla.jomotrackzillaapp.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceImpl implements OwnerService{
    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public Iterable<Owner> listOwners() {
        return ownerRepository.findAll();
    }

}
