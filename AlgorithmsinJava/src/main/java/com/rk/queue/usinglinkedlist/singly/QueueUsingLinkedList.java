package com.rk.queue.usinglinkedlist.singly;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by rbhogati on 18/7/17.
 */
public class QueueUsingLinkedList {

    Node front;
    Node rear;
    int size;

    public QueueUsingLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    public QueueUsingLinkedList(Node t, Node r, int s) {
        front = t;
        rear = r;
        size = s;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public void insert(int value){
        Node nptr = new Node(value, null);
        if (rear == null) {
            front = nptr;
            rear = nptr;
        } else {
            rear.setNextLink(nptr);
            rear = rear.getNextLink();
        }
        size++;
    }

    public int remove(){
        if (isEmpty()){
            throw new NoSuchElementException("Underflow Exception");
        }
        Node ptr = front;
        front = ptr.getNextLink();
        if (front == null) {
            rear = null;
        }
        size--;
        return ptr.getData();
    }

    public int peek(){
        if (isEmpty()){
            throw new NoSuchElementException("Underflow Exception");
        }
        return front.getData();
    }

    public void display(){
        System.out.print("\nQueue = ");
        if (size == 0) {
            System.out.print("Empty\n");
        }
        Node ptr = front;
        while (ptr!= rear.getNextLink()) {
            System.out.print(ptr.getData() + " ");
            ptr = ptr.getNextLink();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /* Creating object of class linkedQueue */
        QueueUsingLinkedList lq = new QueueUsingLinkedList();

        /* Perform Queue Operations */
        System.out.println("Linked Queue Test\n");

        char ch;
        do {
            System.out.println("\nQueue Operations");
            System.out.println("1. insert");
            System.out.println("2. remove");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. size");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 :
                    System.out.println("Enter integer element to insert");
                    lq.insert( scan.nextInt() );
                    break;
                case 2 :
                    try {
                        System.out.println("Removed Element = "+ lq.remove());
                    }
                    catch (Exception e){
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 3 :
                    try {
                        System.out.println("Peek Element = "+ lq.peek());
                    }
                    catch (Exception e) {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 4 :
                    System.out.println("Empty status = "+ lq.isEmpty());
                    break;
                case 5 :
                    System.out.println("Size = "+ lq.getSize());
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            /* display queue */
            lq.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');

    }

}
