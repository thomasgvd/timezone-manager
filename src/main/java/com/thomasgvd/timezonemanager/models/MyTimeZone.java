package com.thomasgvd.timezonemanager.models;

import java.util.ArrayList;
import java.util.List;

public class MyTimeZone {

    private String timeZone;
    private String date;
    private List<String> cities;

    public MyTimeZone() {
        this.cities = new ArrayList<>();
    }

    public MyTimeZone(String timeZone, String date, List<String> cities) {
        this.timeZone = timeZone;
        this.date = date;
        this.cities = cities;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }
}
