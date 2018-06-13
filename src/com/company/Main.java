package com.company;

import java.util.ArrayList;

public class Main {


    public static void main (String[] args)
    {
        ArrayList<String> jobs = new ArrayList<>();
        ArrayList<String> educations = new ArrayList<>();
        Education edu = new Education();
        Job job = new Job();
        Person person = new Person();

        makeList(educations, jobs);

        edu.setEduList(educations);
        job.setJobList(jobs);

        System.out.println("Your education history: "+edu.toString());
        System.out.println("=============================");
        System.out.println("Your job history: "+job.toString());

    }

    protected static void makeList (ArrayList<String> jobs,ArrayList<String> educations )
    {
        jobs.add("Writer");
        jobs.add("Editor");
        jobs.add("Architect");
        jobs.add("Programmer");

        educations.add("Arcola Elementary School");
        educations.add("Ashburton Elementary School");
        educations.add("Cashell Elementary School");
        educations.add("Cabin John Middle School");
        educations.add("Earle B. Wood Middle School");
        educations.add("Clarksburg High School");
        educations.add("Montgomery Blair High School");
        educations.add("Montgomery college");
        educations.add("University of Maryland");
        educations.add("Seoul University");


    }





}
