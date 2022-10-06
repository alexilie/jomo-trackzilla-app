package com.jomo.trackzilla.jomotrackzillaapp;

import com.jomo.trackzilla.jomotrackzillaapp.entity.Application;
import com.jomo.trackzilla.jomotrackzillaapp.repository.ApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JomoTrackzillaAppApplication {
	private static final Logger log = LoggerFactory.getLogger(JomoTrackzillaAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JomoTrackzillaAppApplication.class, args);
		System.out.println("Hello World!");
		System.out.println("######JomoTrackzillaAppApplication is UP and RUNNING#####");
	}

	/*
	@Bean
	public CommandLineRunner demo(ApplicationRepository repository) {
		return (args) -> {
			repository.save(new Application("Trackzilla", "Defect Tracking", "kesha.williams", "Application for tracking bugs."));
			repository.save(new Application("Expenses", "Finance", "mary.jones", "Application to track expense reports."));
			repository.save(new Application("Notifications", "Enterprise Notification", "karen.kane", "Application to send alerts and notifications to users."));

			repository.save(new Application("SAP", "SAP", "dimitar.staikov", "SAP Application used by various business line"));
			repository.save(new Application("Outlook", "Email", "alin.ungurean", "Email application"));
			repository.save(new Application("API", "EAPI MW", "alex.ilie", "API MW Application used for Integration"));

			for (Application application : repository.findAll()) {
				log.info("The application is: " + application.toString());
			}
		};
	}*/
}
