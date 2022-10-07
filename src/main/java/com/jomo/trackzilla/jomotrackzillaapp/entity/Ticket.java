package com.jomo.trackzilla.jomotrackzillaapp.entity;

import javax.persistence.*;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ticket_id")
    private long id;

    @Column(name="ticket_number")
    private String number;

    private String title;



    @Column(name="ticket_name")
    private String name;
    private String description;
    private String status;
    private String applicationName;
    private String releaseName;
    private String releaseDate;


    public String getApplicationName() { return applicationName;}
    public void setApplicationName(String applicationName) {this.applicationName = applicationName;}

    public String getReleaseName() { return releaseName;}
    public void setReleaseName(String releaseName) { this.releaseName = releaseName;}

    public Release getRelease() { return release; }
    public void setRelease(Release release) {  this.release = release; }

    public String getReleaseDate() { return releaseDate;  }
    public void setReleaseDate(String releaseDate) { this.releaseDate = releaseDate;  }


    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;

    public Application getApplication() {
        return application;
    }
    public void setApplication(Application application) {
        this.application = application;
    }


    @ManyToOne
    @JoinTable(name ="ticket_release", joinColumns = @JoinColumn(name = "ticket_fk"), inverseJoinColumns = @JoinColumn(name = "release_fk"))
    private Release release;

    public long getId()         {  return id;    }
    public void setId(long id)  {   this.id = id;  }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public String getTitle() {        return title;    }
    public void setTitle(String title) {        this.title = title;    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Ticket() {
    }

    public Ticket(String number, String name, String title, String description, String status) {
        this.number = number;
        this.title = title;
        this.name = name;
        this.description = description;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", applicationName='" + applicationName + '\'' +
                ", releaseName='" + applicationName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
