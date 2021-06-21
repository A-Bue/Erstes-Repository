/*
 *  Copyright (C) 2014 Christian Knorr.
 *  All rights reserved.
 */

package lang;

import java.time.LocalDate;

public class SwitchExample {

    public static void main(String[] args) {
        String currentMonth;
        int currentMonthInt = LocalDate.now().getMonthValue();

        switch (currentMonthInt) {
            case 1:
                currentMonth = "January";
                break;
            case 2:
                currentMonth = "February";
                break;
            case 3:
                currentMonth = "March";
                break;
            case 4:
                currentMonth = "April";
                break;
            case 5:
                currentMonth = "May";
                break;
            case 6:
                currentMonth = "June";
                break;
            case 7:
                currentMonth = "July";
                break;
            case 8:
                currentMonth = "August";
                break;
            case 9:
                currentMonth = "September";
                break;
            case 10:
                currentMonth = "October";
                break;
            case 11:
                currentMonth = "November";
                break;
            case 12:
                currentMonth = "December";
                break;
            default:
                currentMonth = "<undefined>";
                break;
        }

        System.out.println("We are in " + currentMonth + " today.");
    }
}
