package com.jomo.trackzilla.jomotrackzillaapp.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class TrackzillaHealthIndicator implements HealthIndicator {
    private final String message_key = "TrackzillaService";

    @Override
    public Health health() {
        if (!isRunningTrackzillaService()) {
            return Health.down().withDetail(message_key, "Not Available").build();
        }
        return Health.up().withDetail(message_key, "Available").build();
    }
    private Boolean isRunningTrackzillaService() {
        Boolean isRunning = false;
        // TO DO and validate with external service
        return isRunning;
    }
}