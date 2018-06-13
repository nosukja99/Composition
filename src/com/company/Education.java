package com.company;

import java.util.ArrayList;

public class Education {


    ArrayList<String> eduList;

    public Education()
    {

    }
    public ArrayList<String> getEduList() {
        return eduList;
    }

    public void setEduList(ArrayList<String> eduList) {
        this.eduList = eduList;
    }

    @Override
    public String toString()
    {
        String display ="";
        for(String edu : eduList)
            display = display+"\n"+edu;
        return display;
    }


}


