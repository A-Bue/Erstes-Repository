/*
 *  Copyright (C) 2014 Christian Knorr.
 *  All rights reserved.
 */

package lang;

public class DoWhileExample {

    public static void main(String[] args) {
        int i = 0;
        int delay = 50 * 1000 * 1000;
        long start = System.nanoTime();

        do {
//            System.out.println("This is run #" + i++);
            i++;
        } while (System.nanoTime() < start + delay);

        System.out.println("Performed " + i + " loop cylces in " + delay / 1000 / 1000 + " milliseconds.");
    }
}
