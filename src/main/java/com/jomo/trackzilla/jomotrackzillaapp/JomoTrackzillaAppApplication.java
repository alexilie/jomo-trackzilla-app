package com.jomo.trackzilla.jomotrackzillaapp;

import com.jomo.trackzilla.jomotrackzillaapp.entity.Application;
import com.jomo.trackzilla.jomotrackzillaapp.entity.Owner;
import com.jomo.trackzilla.jomotrackzillaapp.entity.Release;
import com.jomo.trackzilla.jomotrackzillaapp.entity.Ticket;
import com.jomo.trackzilla.jomotrackzillaapp.repository.ApplicationRepository;
import com.jomo.trackzilla.jomotrackzillaapp.repository.OwnerRepository;
import com.jomo.trackzilla.jomotrackzillaapp.repository.ReleaseRepository;
import com.jomo.trackzilla.jomotrackzillaapp.repository.TicketRepository;
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


	@Bean
	public CommandLineRunner loadApplications(ApplicationRepository applicationRepository, TicketRepository ticketRepository, ReleaseRepository releaseRepository, OwnerRepository ownerRepository) {

		return (args) -> {
			Application applicationWorker;
			Ticket 		ticketWorker;
			Release 	releaseWorker;
			//1
			applicationWorker 	= new Application("Trackzilla", "Defect Tracking", "Kesha.williams", "Application for tracking bugs.");
			ticketWorker 		= new Ticket("123123123", "SR17297371", "Service Request", "Description", "OPEN");
			releaseWorker 		= new Release("Q1 Release Containing High Priority Bugs", "2022-02-14","Description" );

			applicationRepository.save(applicationWorker);
			releaseRepository.save(releaseWorker);

			ticketWorker.setApplication(applicationWorker);
			ticketWorker.setRelease(releaseWorker);
			ticketWorker.setApplicationName(applicationWorker.getName());
			ticketWorker.setReleaseName(releaseWorker.getName());
			ticketWorker.setReleaseDate(releaseWorker.getReleaseDate());
			ticketRepository.save(ticketWorker);

			//2
			applicationWorker = new Application("Expenses", "Finance", "mary.jones", "Application to track expense reports.");
			ticketWorker = new Ticket("123123656", "SR91298736", "Service Request", "Description", "PENDING");
			releaseWorker = new Release("Q2 Release Containing High Priority Enhancements", "2022-05-27","Description");

			applicationRepository.save(applicationWorker);
			releaseRepository.save(releaseWorker);

			ticketWorker.setApplication(applicationWorker);
			ticketWorker.setRelease(releaseWorker);
			ticketWorker.setApplicationName(applicationWorker.getName());
			ticketWorker.setReleaseName(releaseWorker.getName());
			ticketWorker.setReleaseDate(releaseWorker.getReleaseDate());
			ticketRepository.save(ticketWorker);

			ticketWorker = new Ticket("456456456", "CH12374987", "Change Control", "Description", "APPROVED");
			ticketWorker.setApplication(applicationWorker);
			ticketWorker.setRelease(releaseWorker);
			ticketWorker.setApplicationName(applicationWorker.getName());
			ticketWorker.setReleaseName(releaseWorker.getName());
			ticketWorker.setReleaseDate(releaseWorker.getReleaseDate());
			ticketRepository.save(ticketWorker);

			//3
			applicationWorker = new Application("Notifications", "Enterprise Notification", "karen.kane", "Application to send alerts and notifications to users.");
			ticketWorker = new Ticket("123123123", "SR17297371", "Service Request", "Description", "OPEN");
			releaseWorker = new Release("Q3 Release Containing Bugs", "2022-12-10","Description" );

			applicationRepository.save(applicationWorker);
			releaseRepository.save(releaseWorker);

			ticketWorker.setApplication(applicationWorker);
			ticketWorker.setRelease(releaseWorker);
			ticketWorker.setApplicationName(applicationWorker.getName());
			ticketWorker.setReleaseName(releaseWorker.getName());
			ticketWorker.setReleaseDate(releaseWorker.getReleaseDate());
			ticketRepository.save(ticketWorker);

			ticketWorker = new Ticket("123123656", "SR91298736", "Service Request", "Description", "PENDING");
			ticketWorker.setApplication(applicationWorker);
			ticketWorker.setRelease(releaseWorker);
			ticketWorker.setApplicationName(applicationWorker.getName());
			ticketWorker.setReleaseName(releaseWorker.getName());
			ticketWorker.setReleaseDate(releaseWorker.getReleaseDate());
			ticketRepository.save(ticketWorker);


			ticketWorker = new Ticket("456456456", "CH12374987", "Change Control", "Description", "APPROVED");
			ticketWorker.setApplication(applicationWorker);
			ticketWorker.setRelease(releaseWorker);
			ticketWorker.setApplicationName(applicationWorker.getName());
			ticketWorker.setReleaseName(releaseWorker.getName());
			ticketWorker.setReleaseDate(releaseWorker.getReleaseDate());
			ticketRepository.save(ticketWorker);

			//4
			applicationWorker = new Application("SAP", "SAP", "dimitar.staikov", "SAP Application used by various business line");
			releaseWorker = new Release("Q3 Release Containing Bugs", "2022-12-10","Description");
			ticketWorker = new Ticket("645645645", "INC12873987","Incident", "Description", "CLOSED");

			applicationRepository.save(applicationWorker);
			releaseRepository.save(releaseWorker);

			ticketWorker.setApplication(applicationWorker);
			ticketWorker.setRelease(releaseWorker);
			ticketWorker.setApplicationName(applicationWorker.getName());
			ticketWorker.setReleaseName(releaseWorker.getName());
			ticketWorker.setReleaseDate(releaseWorker.getReleaseDate());
			ticketRepository.save(ticketWorker);

			ticketWorker = new Ticket("456454566", "INC809288898","Incident", "Description", "OPEN");
			ticketWorker.setApplication(applicationWorker);
			ticketWorker.setRelease(releaseWorker);
			ticketWorker.setApplicationName(applicationWorker.getName());
			ticketWorker.setReleaseName(releaseWorker.getName());
			ticketWorker.setReleaseDate(releaseWorker.getReleaseDate());
			ticketRepository.save(ticketWorker);

			//5
			applicationWorker = new Application("Outlook", "Email", "alin.ungurean", "Email application");
			releaseWorker = new Release("Q4 Release Containing Enhancements", "2022-12-10","Description" );
			ticketWorker = new Ticket("345345345", "CH8178978787", "Change Control", "Description", "SUBMITTED");

			applicationRepository.save(applicationWorker);
			releaseRepository.save(releaseWorker);

			ticketWorker.setApplication(applicationWorker);
			ticketWorker.setRelease(releaseWorker);
			ticketWorker.setApplicationName(applicationWorker.getName());
			ticketWorker.setReleaseName(releaseWorker.getName());
			ticketWorker.setReleaseDate(releaseWorker.getReleaseDate());
			ticketRepository.save(ticketWorker);


			ticketWorker = new Ticket("353453534", "CH7987987873", "Change Control", "Description", "SUBMITTED");
			ticketWorker.setApplication(applicationWorker);
			ticketWorker.setRelease(releaseWorker);
			ticketWorker.setApplicationName(applicationWorker.getName());
			ticketWorker.setReleaseName(releaseWorker.getName());
			ticketWorker.setReleaseDate(releaseWorker.getReleaseDate());
			ticketRepository.save(ticketWorker);

			//end
			applicationRepository.save(new Application("Outlook", "Email", "alin.ungurean", "Email application"));
			applicationRepository.save(new Application("API", "API Middleware", "alex.ilie", "API MW Application used for Integration"));
			applicationRepository.save(new Application("CLOUD", "Technology", "alex.ilie", "API MW Application used for Integration"));

			//Release
			releaseRepository.save(new Release("Q4 Operational Enhancements", "2022-12-10","Description" ));
			releaseRepository.save(new Release("Q4 Performance Enhancements", "2022-02-14","Description" ));

			//Owner
			ownerRepository.save(new Owner("Kesha Williams", "Director"));
			ownerRepository.save(new Owner("Alex ILIE", "Architect"));
			ownerRepository.save(new Owner("Rod Kelly", "Senior Director"));
			ownerRepository.save(new Owner("Alin Ungurean", "Senior Director"));
			ownerRepository.save(new Owner("Dimitar Staikov", "VP Delivery"));

			for (Application application : applicationRepository.findAll()) {
				log.info("The application is: " + application.toString());
			}

			for (Ticket ticket : ticketRepository.findAll()) {
				log.info("The ticket is: " + ticket.toString());
			}
			for (Release release : releaseRepository.findAll()) {
				log.info("The release is: " + release.toString());
			}
			for (Owner owner : ownerRepository.findAll()) {
				log.info("The Owner is: " + owner.toString());
			}
		};
	}//


}
