/*
Create a simple LinkedList by appending 30 and 70 to 56
 */
package com.bridgelabz;

import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList DataStructure Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the Start"); // UC 2
        System.out.println("Enter 2 to add the data at the End"); // UC 3

        switch (scanner.nextInt()) {
            case 1:
                ListOfOperation.addData();//Calling addData() method
                break;
            case 2:
                ListOfOperation.appendData();//Calling appendData() method
                break;

        }

    }
}