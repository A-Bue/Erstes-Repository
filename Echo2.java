/*
 *  Copyright (C) 2018 Christian Knorr.
 *  All rights reserved.
 */

import java.util.Scanner;

public class Echo2 {

    public static void main(String[] args) {
        
        System.out.print("Enter your message: ");
        Scanner scan = new Scanner(System.in);
        String msg = scan.nextLine();
        System.out.println("Echo: " + msg);
    }
}
