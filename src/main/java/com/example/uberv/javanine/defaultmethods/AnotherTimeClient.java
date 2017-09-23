package com.example.uberv.javanine.defaultmethods;

import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public interface AnotherTimeClient extends TimeClient {

    // Overriding default methods:

    // 1. Do not mention it - default parent's implementation will be used
    // . . .

    // 2. Redeclare the default method, which makes it abstract
//    ZonedDateTime getZonedDateTime(String zoneString);


    // 3. Redefine the default method, which overrides it
    @Override
    default ZonedDateTime getZonedDateTime(String zoneString) {
        try {
            return ZonedDateTime.of(getLocalDateTime(), ZoneId.of(zoneString));
        } catch (DateTimeException e) {
            System.err.println("Invalid zone ID: " + zoneString +
                    "; using the default time zone instead.");
            return ZonedDateTime.of(getLocalDateTime(), ZoneId.systemDefault());
        }
    }
}
