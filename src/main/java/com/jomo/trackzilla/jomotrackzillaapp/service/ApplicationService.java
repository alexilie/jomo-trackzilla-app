package com.jomo.trackzilla.jomotrackzillaapp.service;

import com.jomo.trackzilla.jomotrackzillaapp.entity.Application;

public interface ApplicationService {
    Iterable<Application> listApplications();
    Application findApplication(long id);
}


