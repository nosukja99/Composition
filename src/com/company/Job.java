package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Job {
    ArrayList<String> jobList;

    public Job()
    {

    }

    public ArrayList<String> getJobList() {
        return jobList;
    }

    public void setJobList(ArrayList<String> jobList) {
        this.jobList = jobList;
    }


    @Override
    public String toString()
    {
        String display ="";
        for(String job : jobList)
            display = display+"\n"+job;
        return display;
    }
}
