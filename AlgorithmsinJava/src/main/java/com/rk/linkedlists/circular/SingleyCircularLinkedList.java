package com.rk.linkedlists.circular;

/**
 * Created by rbhogati on 14/7/17.
 */
public class SingleyCircularLinkedList {

    private Node start;
    private Node end;
    private int size;

    public SingleyCircularLinkedList() {
        start = null;
        end = null;
        size = 0;
    }

    public SingleyCircularLinkedList(Node s, Node e, int size){
        this.start = s;
        this.end = e;
        this.size = size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public void insertAtStart(int value){
        Node nptr = new Node(value, null);
        if (start == null) {
            start = nptr;
            start.setNextLink(end);
            end.setNextLink(start);
        } else {
            nptr.setNextLink(start);
            start = nptr;
            end.setNextLink(start);
        }
        size++;
    }

    public void insertAtEnd(int value){
        Node nptr = new Node(value, null);
        if (start == null) {
            start = nptr;
            start.setNextLink(end);
            end.setNextLink(start);
        } else {
            end.setNextLink(nptr);
            nptr.setNextLink(start);
        }
        size++;
    }

    public void insertAtPosition(int value, int pos){
        Node nptr = new Node(value, null);
        if (size == 0) {
            start = nptr;
            start.setNextLink(end);
            end.setNextLink(start);
            size++;
            return;
        }
        Node ptr = start;

    }

    public void deleteAtPosition(int value, int pos){

    }


}
