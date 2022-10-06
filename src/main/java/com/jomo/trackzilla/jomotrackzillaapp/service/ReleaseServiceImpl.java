package com.jomo.trackzilla.jomotrackzillaapp.service;


import com.jomo.trackzilla.jomotrackzillaapp.entity.Release;
import com.jomo.trackzilla.jomotrackzillaapp.repository.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ReleaseServiceImpl implements ReleaseService {
    @Autowired
    private ReleaseRepository releaseRepository;

    @Override
    public Iterable<Release> listReleases() {
        return releaseRepository.findAll();
    }

}
