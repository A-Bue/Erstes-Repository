/*
 *  Copyright (C) 2014 Christian Knorr.
 *  All rights reserved.
 */

package lang;

public class IfThenElseExample {

    public static void main(String[] args) {
        System.out.println("Welcome to the age checker");
        System.out.println("--------------------------");
        System.out.println();

        System.out.print("Please enter your age: ");
        int age = SystemInReader.readInt();

        if (age > 19) {
            System.out.println("Sorry dude, this is a U20-party!");
        } else {
            System.out.println("Welcome to the party. Have fun!");
        }
    }
}
