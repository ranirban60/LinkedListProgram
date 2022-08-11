package com.bridgelabz;

public class LinkedList {
    Node head, tail;

    public Node push(int data) {//56=>30=>70
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
    }
    public void append(int data) { // 56=> 30=> 70
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            this.tail.next = newNode;
            tail = newNode;
        }
    }
    public void insertDataInBetween(Node previousNode, Node newNode) {//56->30->70
        Node tempNode = previousNode.next;
        previousNode.next = newNode;
        newNode.next = tempNode;
    }
    public void pop() {
        if (this.head == null) {

        }
        Node temp = head;
        head = temp.next;
        temp = null;
    }
    public void popLast() {
        if (head == null)
            System.out.println("No elements to delete.");
        else if (head.next == null)
            head = null;
        else {
            Node temp = head;

            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    public void print() {//To print the data
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.key + " ");
                temp = temp.next;
            }
        }
    }
    public void searchData(int searchData) {//to search or find a data
        if(head.key == searchData)
            System.out.println(searchData + " is Found");
        else {
            Node temp=head;
            boolean isFound=false;

            while(temp!=null) {
                if(temp.key == searchData) {
                    isFound = true;
                    break;
                }
                temp=temp.next;
            }
            System.out.println("                      ");
            if(isFound == true)
                System.out.println(searchData+ " is Found");
            else
                System.out.println(searchData+" is not found");
        }
    }
    public int size() {
        int count = 0; // No data 1 element

        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void insertAfterElement(int userIndex, int data) {

        if (userIndex == 0)
            push(data);


        else if (userIndex == size())
            append(data);


        else if (userIndex < 0 || userIndex >= size())
            System.out.println("Invalid index");

        else {
            // Creating New Node
            Node newNode = new Node(data);

            // To track traversing
            int index = 0;

            // Pointers to track left & right side elements
            Node left = head;
            Node right = left.next;
            while (index < userIndex - 1) {
                left = left.next;
                right = right.next;
                index++;
            }


            newNode.next = right;
            left.next = newNode;

        }

    }

}

