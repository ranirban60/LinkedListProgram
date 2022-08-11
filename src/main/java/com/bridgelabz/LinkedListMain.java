/*
Ability to search Linked List to find Node with value 30
 */
package com.bridgelabz;

import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList DataStructure Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the Start"); // UC2
        System.out.println("Enter 2 to add the data at the End"); // UC3
        System.out.println("Enter 3 to add the data at In Between"); // UC4
        System.out.println("Enter 4 to delete the data at First position"); // UC5
        System.out.println("Enter 5 to delete the data at the Last Position");// UC6
        System.out.println("Enter 6 to search the data"); // UC7
        System.out.println("Enter 7 to add at the Index position "); // UC8
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
            case 5:
                ListOfOperation.popLast();//Calling popLast() method
                break;
            case 6:
                ListOfOperation.searchData();//Calling searchData() method
                break;
            case 7:
                ListOfOperation.insertAfterElement();//Calling insertAtSpecificIndex() method
                break;
        }
    }
}