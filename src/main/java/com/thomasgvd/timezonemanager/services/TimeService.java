package com.thomasgvd.timezonemanager.services;

import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Service
public class TimeService {

    public String getCurrentTime(String timeZone) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        df.setTimeZone(TimeZone.getTimeZone(timeZone));
        return df.format(new Date());
    }
}
