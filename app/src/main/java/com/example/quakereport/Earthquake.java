package com.example.quakereport;

public class Earthquake {

    private double mag;
    private String place, url;
    private static long time;

    public Earthquake(double mag, String place, long time, String url) {
        this.mag = mag;
        this.place = place;
        this.time= time;
        this.url = url;
    }

    public double getMag() {
        return mag;
    }

    public String getPlace() {
        return place;
    }

    public static long getTime() {
        return time;
    }

    public String getUrl() {
        return url;
    }
}
