package com.jomo.trackzilla.jomotrackzillaapp.service;

import com.jomo.trackzilla.jomotrackzillaapp.entity.Owner;
import com.jomo.trackzilla.jomotrackzillaapp.exception.OwnerNotFoundException;
import com.jomo.trackzilla.jomotrackzillaapp.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OwnerServiceImpl implements OwnerService{
    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public Iterable<Owner> listOwners() {
        return ownerRepository.findAll();
    }

    @Override
    public Owner findOwner(long id)  {
        Optional<Owner> optionalOwner = ownerRepository.findById(id);

        if(optionalOwner.isPresent())
            return optionalOwner.get();
        else
            throw new OwnerNotFoundException("Owner Not Found");
    }

}
