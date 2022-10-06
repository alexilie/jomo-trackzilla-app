package com.jomo.trackzilla.jomotrackzillaapp.service;

import com.jomo.trackzilla.jomotrackzillaapp.entity.Application;
import com.jomo.trackzilla.jomotrackzillaapp.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public Iterable<Application> listApplications() {
        return applicationRepository.findAll();
    }

}
