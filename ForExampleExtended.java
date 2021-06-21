/*
 *  Copyright (C) 2015 Christian Knorr.
 *  All rights reserved.
 */

package lang;

public class ForExampleExtended {

    public static void main(String[] args) {
        int[] samples = { 1, 5, 7, 9 };

//        for (int i = 0; i < samples.length; i++) {
//            System.out.print(samples[i] + "  ");
//        }
        for (int i : samples) {
            System.out.print(i + "  ");
        }
    }
}
