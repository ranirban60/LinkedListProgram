package com.bridgelabz;

public class ListOfOperation {
    public static void addData() {//This method is used to add data at start
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
    }
    public static void appendData() {//This method is used to add data at end
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }
    public static void insertDataInBetween(){
        LinkedList linkedList=new LinkedList();
        Node secondNode =linkedList.push(70);
        Node firstNode =linkedList.push(56);
        Node newNode =new Node(30);
        System.out.println("Before");
        linkedList.print();
        linkedList.insertDataInBetween(firstNode,newNode);
        System.out.println(                             );
        System.out.println("After");
        linkedList.print();
    }
}
