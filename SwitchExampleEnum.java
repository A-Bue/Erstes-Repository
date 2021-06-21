/*
 *  Copyright (C) 2014 Christian Knorr.
 *  All rights reserved.
 */

package lang;

import java.time.LocalDate;
import java.time.Month;

public class SwitchExampleEnum {

    public static void main(String[] args) {
        int numberOfDays;
        LocalDate now = LocalDate.now();
        Month currentMonth = now.getMonth();

        switch (currentMonth) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                numberOfDays = 31;
                break;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                numberOfDays = 30;
                break;
            case FEBRUARY:
                if (now.isLeapYear()) {
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }
                break;
            default:
                numberOfDays = -1;
                break;
        }

        System.out.println("The current month " + currentMonth + " has " + numberOfDays + " days.");
    }
}
