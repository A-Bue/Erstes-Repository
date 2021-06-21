/*
 *  Copyright (C) 2014 Christian Knorr.
 *  All rights reserved.
 */

package lang;

public class ForExample {

    public static void main(String[] args) {
        int n;
        System.out.print("Enter number of waves: ");
        while ((n = SystemInReader.readInt()) < 0) {
            System.out.print("Number must not be negative. Please try again: ");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("¸.·´¯`·.¸¸");
        }
        System.out.println();
    }
}
