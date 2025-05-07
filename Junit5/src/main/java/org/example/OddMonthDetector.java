package org.example;

import java.time.Month;

public class OddMonthDetector {
    public static boolean isOdd(Month month) {
        return month.getValue() % 2 == 1;
    }
}
