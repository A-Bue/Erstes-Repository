/*
 *  Copyright (C) 2014 Christian Knorr.
 *  All rights reserved.
 */

package lang;

import java.time.LocalDate;

public class SwitchExample2 {

    public static void main(String[] args) {
        String season;
        int currentMonthInt = LocalDate.now().getMonthValue();

        switch (currentMonthInt) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Fall";
                break;
            default:
                season = "<undefined>";
                break;
        }

        System.out.println("We are in " + season + " season today.");
    }
}
