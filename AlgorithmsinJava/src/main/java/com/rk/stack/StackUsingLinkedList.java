package com.rk.stack;

import java.util.NoSuchElementException;

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
        return current.getData();
    }

    public int peek(){
        if(isEmpty()){
            throw new NoSuchElementException("Underflow Exception");
        }
        return head.getData();
    }



}
