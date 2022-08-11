/*
Ability to create OrderedLinkedList
 */
package com.bridgelabz;

    public class OrderedLinkedList<T extends Comparable <T>> {
        MyNode<T> head;
        MyNode<T> current;
        int position;

        public OrderedLinkedList() {
            head = null;
            current = null;
            position = -1;

        }

        public void add(T data) {
            MyNode<T> newNode = new MyNode<T>(data);
            if (head == null) {
                head = newNode;
                current = head;
            } else if (head.data.compareTo(data) > 0) {
                newNode.next = head;
                head = newNode;
            } else if (current.data.compareTo(data) < 0) {
                current.next = newNode;
                current = newNode;
            } else {
                MyNode<T> tempPrev = head;
                MyNode<T> tempCurrent = head.next;
                while ((tempCurrent != current) && (tempCurrent.data.compareTo(data) < 0)) {
                    tempPrev = tempCurrent;
                    tempCurrent = tempCurrent.next;
                }
                tempPrev.next = newNode;
                newNode.next = tempCurrent;
            }
            position++;

        }

        public void remove(int data) {
            MyNode n = head;
            MyNode n1 = null;
            if (head == null) {
                head = n;
            }
            for (int i = 0; i < data - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
        }

        public boolean search(T data) {
            return index(data) == -1 ? false : true;
        }

        public boolean isEmpty() {
            return position == -1 ? true : false;
        }

        public int size() {
            return position + 1;
        }

        public void append(T data) {
            add(data);
        }

        public int index(T data) {
            if (position == -1) {
                return -1;
            }
            MyNode<T> tempCurrent = head;
            int tempPosition = 0;
            while (!tempCurrent.data.equals(data)) {
                if (tempCurrent == current) {
                    return -1;
                }
                tempCurrent = tempCurrent.next;
                tempPosition++;
            }
            return tempPosition;
        }

        public void insertAt(int index, T data) {
            MyNode<T> new_node = new MyNode<T>(data);
            new_node.data = data;
            new_node.next = null;

            if (index == 0) {
                add(data);
            } else {
                MyNode<T> n = head;
                for (int i = 0; i < index - 1; i++) {
                    n = n.next;
                }
                new_node.next = n.next;
                n.next = new_node;
            }
        }

        public T pop(int location) {
            MyNode<T> tempCurrent = head;
            MyNode<T> tempPrev = null;
            int tempPosition = 0;
            position--;
            while (tempPosition != location) {
                tempPrev = tempCurrent;
                tempCurrent = tempCurrent.next;
                tempPosition++;
            }
            if (tempCurrent == head) {
                head = head.next;
                return tempCurrent.data;
            } else if (tempCurrent == current) {
                current = tempPrev;
                tempPrev.next = tempCurrent.next;
                return tempCurrent.data;
            } else if (tempCurrent == current) {
                current = tempPrev;
                tempPrev.next = tempCurrent.next;
                return tempCurrent.data;
            } else {
                tempPrev.next = tempCurrent.next;
                return tempCurrent.data;
            }
        }

        public T pop() {
            return pop(position);
        }

        public T get(int location) {
            MyNode<T> tempCurrent = head;
            int tempPosition = 0;
            while (tempPosition != location) {
                tempCurrent = tempCurrent.next;
                tempPosition++;
            }
            return tempCurrent.data;
        }

        public void list() {
            MyNode<T> tempCurrent = head;
            while (tempCurrent != null) {
                System.out.println(tempCurrent.data);
                tempCurrent = tempCurrent.next;
            }
        }

        public static class MyNode<T> {
            T data; //data to be stored
            MyNode<T> next; //reference to the next node

            public MyNode(T data) {
                this.data = data;
                next = null;
            }
        }

        public static void main(String[] args) {
            OrderedLinkedList<Integer> orderedLinkList = new OrderedLinkedList<>();
            orderedLinkList.add(56);
            orderedLinkList.add(30);
            orderedLinkList.add(70);
            System.out.println(" linkedList:");
            orderedLinkList.list();

            orderedLinkList.insertAt(2, 40);
            System.out.println(" Linkedlist After 40 after 30 :");
            orderedLinkList.list();

            orderedLinkList.remove(2);
            System.out.println(" Linkedlist after deletion: ");
            orderedLinkList.list();
            System.out.println("size of linked list :"+orderedLinkList.size());
        }
    }