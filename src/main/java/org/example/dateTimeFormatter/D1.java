package org.example.dateTimeFormatter;

import java.time.Clock;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class D1 {
    public static void main(String[] args) {

        LocalDate dateValue = LocalDate.parse("2023-10-20"); // yyyy-mm-dd is the default format.
        String formatDate = dateValue.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
        System.out.println(formatDate);//20-10-2023

        String formatDateMonth = dateValue.format(DateTimeFormatter.ofPattern("dd-MMM-YYYY"));
        System.out.println(formatDateMonth);//20-Oct-2023

        String userPattern = dateValue.format(DateTimeFormatter.ofPattern("YYYY-dd-MMM"));
        System.out.println(userPattern);//2023-20-Oct For patterns from the user.

        // LocalDate l = LocalDate.parse("28-Feb-2023", DateTimeFormatter.ofPattern("dd-MMM-YYYY"));;// Either pass the data as the default form or
        // pass the data with teh format pattern.
        // System.out.println(l.format(DateTimeFormatter.ISO_DATE));

        // Today date.
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now(Clock.systemUTC()));
    }
}
