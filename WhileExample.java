/*
 *  Copyright (C) 2014 Christian Knorr.
 *  All rights reserved.
 */

package lang;

public class WhileExample {

    public static void main(String[] args) {
        int n, i, result = 1;

        System.out.print("Enter number >= 0: ");
        while ((n = i = SystemInReader.readInt()) < 0) {
            System.out.print("Entered number is < 0. Please try again: ");
        }

        while (i > 0) {
            result *= i--;
        }

        System.out.println("fak(" + n + ") = " + result);
    }
}
