package com.thomasgvd.timezonemanager.models;

public enum MyTimeZone {
    PARIS("Europe/Paris"),
    TOKYO("Asia/Tokyo"),
    LOS_ANGELES("America/Los_Angeles"),
    NEW_YORK("America/New_York"),
    LONDON("Europe/London"),
    SHANGHAI("Asia/Shanghai");

    private final String value;

    MyTimeZone(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
