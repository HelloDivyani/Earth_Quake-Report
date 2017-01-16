package com.example.android.quakereport;

/**
 * Created by Divyani on 15-01-2017.
 */
public class EarthQuake_Single {
    // It holds data of single earthquake
    private String mag;
    private String date;
    private String location;


    // A constructor have same name as that of the class
    // It is always public and does not have any return type not even void
    public  EarthQuake_Single(String magnitude,String mlocation,String mdate)
    {
        // parameterized constructor of the class EarthQuake_Single
        mag=magnitude;
        date=mdate;
        location=mlocation;
    }
    // Since All the data is private we need to create public methods to give data to other class
    public String getMagnitude()
    {
        return mag;
    }
    public String getDate()
    {
        return date;
    }
    public String getLocation()
    {
        return location;
    }
}
