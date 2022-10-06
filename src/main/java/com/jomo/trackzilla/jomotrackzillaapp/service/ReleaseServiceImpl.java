package com.jomo.trackzilla.jomotrackzillaapp.service;


import com.jomo.trackzilla.jomotrackzillaapp.entity.Owner;
import com.jomo.trackzilla.jomotrackzillaapp.entity.Release;
import com.jomo.trackzilla.jomotrackzillaapp.exception.OwnerNotFoundException;
import com.jomo.trackzilla.jomotrackzillaapp.exception.ReleaseNotFoundException;
import com.jomo.trackzilla.jomotrackzillaapp.repository.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ReleaseServiceImpl implements ReleaseService {
    @Autowired
    private ReleaseRepository releaseRepository;

    @Override
    public Iterable<Release> listReleases() {
        return releaseRepository.findAll();
    }

    @Override
    public Release findRelease(long id)  {
        Optional<Release> optionalRelease = releaseRepository.findById(id);

        if(optionalRelease.isPresent())
            return optionalRelease.get();
        else
            throw new ReleaseNotFoundException("Release Not Found");
    }
}
