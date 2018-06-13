package com.company;

public class Person {

    Education edu;
    Job job;


    public Person()
    {

    }

    public Person(Education edu, Job job)
    {
        this.edu = edu;
        this.job = job;
    }

    public Education getEdu() {
        return edu;
    }

    public void setEdu(Education edu) {
        this.edu = edu;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
