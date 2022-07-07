package org.launchcode.techjobs.persistent.models;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    public List<Job> getJobs() {
        return jobs;
    }

    public Employer() {

    }

    @NotNull
    @Size(min = 3, max = 255)
    private String location;

    @OneToMany
    @JoinColumn(name="employer_id")
    private List<Job> jobs = new ArrayList<>();

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
