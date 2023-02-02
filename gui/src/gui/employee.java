package gui;

import java.io.*;
public class employee implements Serializable {
    
    private String name;
    private String surname;
    private Job job;
    private int staffNr;

    public employee(String name, String surname, Job job, int staffNr) {
        this.name = name;
        this.surname = surname;
        this.job = job;
        this.staffNr = staffNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getStaffNr() {
        return staffNr;
    }

    public void setStaffNr(int staffNr) {
        this.staffNr = staffNr;
    }
    
    
}
