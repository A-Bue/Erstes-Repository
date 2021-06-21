/*
 *  Copyright (C) 2004 Christian Knorr.
 *  All rights reserved.
 */

public class Echo {

    public static void main(String[] args) {
        System.out.print("Enter your message: ");
        String msg = SystemInReader.readln();
        System.out.println("Echo: " + msg);
    }
}
