package com.example.uberv.javanine.defaultmethods;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

// More info: https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html
public interface TimeClient {
    void setTime(int hour, int minute, int second);

    void setDate(int day, int month, int year);

    void setDateAndTime(int day, int month, int year, int hour, int minute, int second);

    LocalDateTime getLocalDateTime();

    // Newly added functionality
//    ZonedDateTime getZonedDateTime(String zoneString);

    // Now you can also define static methods in an interface
    static ZoneId getZoneId(String zoneString) {
        try {
            return ZoneId.of(zoneString);
        } catch (DateTimeException e) {
            System.err.println("Invalid time zone: " + zoneString +
                    "; using default time zone instead.");
            return ZoneId.systemDefault();
        }
    }

    // Make it a default method, so you don't have to modify it's implementations (such as SimpleTime Client)
    default ZonedDateTime getZonedDateTime(String zoneString) {
        return ZonedDateTime.of(getLocalDateTime(), getZoneId(zoneString));
    }
}
