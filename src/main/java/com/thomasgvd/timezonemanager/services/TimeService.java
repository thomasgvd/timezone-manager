package com.thomasgvd.timezonemanager.services;

import com.thomasgvd.timezonemanager.models.MyTimeZone;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class TimeService {

    private final List<String> supportedTimeZones = new ArrayList<>(
            Arrays.asList("GMT-8", "GMT-5", "GMT-3", "GMT-0", "GMT+1", "GMT+3", "GMT+8", "GMT+9"));

    public List<MyTimeZone> getTimeInAllTimeZones() {
        return supportedTimeZones.stream()
                .map(tz -> new MyTimeZone(tz, getCurrentTime(tz), getCitiesInTimeZone(tz)))
                .collect(Collectors.toList());
    }

    private List<String> getCitiesInTimeZone(String supportedTimeZone) {
        String[] cities = switch (supportedTimeZone) {
            case "GMT-0" -> new String[]{"London", "Dublin"};
            case "GMT+1" -> new String[]{"Paris", "Madrid", "Barcelona"};
            case "GMT+3" -> new String[]{"Moscow"};
            case "GMT+8" -> new String[]{"Hong Kong", "Beijing", "Shanghai"};
            case "GMT+9" -> new String[]{"Tokyo", "Seoul"};
            case "GMT-3" -> new String[]{"São Paulo, Buenos Aires"};
            case "GMT-5" -> new String[]{"New York"};
            case "GMT-8" -> new String[]{"Los Angeles", "Washington DC"};
            default -> new String[0];
        };

        return List.of(cities);
    }

    public String getCurrentTime(String timeZone) {
        DateFormat df = new SimpleDateFormat("EEE, d MMM yyyy - HH'h'mm");
        df.setTimeZone(TimeZone.getTimeZone(timeZone));
        return df.format(new Date());
    }
}
