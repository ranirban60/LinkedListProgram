/*
Ability to delete the first element in the Linked List
 */
package com.bridgelabz;

import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList DataStructure Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the Start"); // UC 2
        System.out.println("Enter 2 to add the data at the End"); // UC 3
        System.out.println("Enter 3 to add the data at In Between"); // UC4
        System.out.println("Enter 4 to delete the data at First position"); // UC 5

        switch (scanner.nextInt()) {
            case 1:
                ListOfOperation.addData();//Calling addData() method
                break;
            case 2:
                ListOfOperation.appendData();//Calling appendData() method
                break;
            case 3:
                ListOfOperation.insertDataInBetween();//Calling insertDataInBetween() method
                break;
            case 4:
                ListOfOperation.pop();//Calling pop() method
                break;
        }

    }
}