package com.rk.stack;

import java.util.NoSuchElementException;
import java.util.Scanner;

/** Stack is basically LIFO - Last In First Out
 * Created by rbhogati on 17/7/17.
 */
public class StackUsingLinkedList {


    Node head;
    int size;
    int data;
    Node current;


    // Functions
    // 1. Last in first out

    public StackUsingLinkedList() {
        head = null;
        size = 0;
        current = null;
    }

    public StackUsingLinkedList(int d, Node n, Node c) {
        head = n;
        data = d;
        current = c;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int getSize(){
        return size;
    }

    public void push(int value) {
        Node nptr = new Node(value, null);
        if (head == null) {
            head = nptr;
            current = nptr;
        } else {
            nptr.setNextLink(head);
            head = nptr;
            current = head;
        }
        size++;
    }

    public int pop() {

        if(isEmpty()){
            throw new NoSuchElementException("Underflow Exception");
        }
        current = head;
        head = head.getNextLink();
        size--;
        return current.getData();
    }

    public int peek(){
        if(isEmpty()){
            throw new NoSuchElementException("Underflow Exception");
        }
        return head.getData();
    }

    public void display(){
        System.out.println("Stack= ");
        if (size == 0){
            System.out.print("Empty\n");
            return;
        }
        Node ptr = head;
        while (ptr != null){
            System.out.print(ptr.getData()+ " ");
            ptr = ptr.getNextLink();
        }
        System.out.println();
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        StackUsingLinkedList st = new StackUsingLinkedList();

        /* Perform Queue Operations */
        System.out.println("Linked Stack Test\n");

        char yesOrNo;
        do {
            System.out.println("\nStack Operations");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check empty");
            System.out.println("5. Size");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter data to push");
                    st.push(scan.nextInt());
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    System.out.println("Peek: " + st.peek());
                    break;
                case 4:
                    System.out.println("IsEMpty = "+ st.isEmpty());
                    break;
                case 5:
                    System.out.println("Size = "+ st.getSize());
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }

            st.display();
            System.out.println("\n Do you want to continue (Type y or n). ");
            yesOrNo = scan.next().charAt(0);
        } while ( yesOrNo == 'y' || yesOrNo == 'Y' );
    }

}
