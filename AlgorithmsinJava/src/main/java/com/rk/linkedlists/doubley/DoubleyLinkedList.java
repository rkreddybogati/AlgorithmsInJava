package com.rk.linkedlists.doubley;

/**
 * Created by rbhogati on 12/7/17.
 */
public class DoubleyLinkedList {


    private int size;
    private Node start;
    private Node end;

    public DoubleyLinkedList(){
        start =null;
        end = null;
        size = 0;
    }

    public DoubleyLinkedList(int d, Node s, Node e){
        start = s;
        end = e;
        size = d;
    }

    public boolean isEmpty(){
        return start == null;
    }

    public int getSize(){
        return size;
    }

    /**
     * Function to insert values at the beginning
     * @param value
     */
    public void insertAtStart(int value){
        Node nptr = new Node(value, null, null);
        if (start == null) {
            start = nptr;
            end = start.getNext();
        } else {
            start.setPrev(nptr);
            nptr.setNext(start);
            start = nptr;
        }
        size++;
    }

    /**
     * Function to insert values at the ending
     * @param value
     */
    public void insertAtEnd(int value){
        Node nptr = new Node(value, null, null);
        if (start == null) {
            start = nptr;
            end = start.getNext();
        } else {
            nptr.setPrev(end);
            end.setNext(nptr);
            end = nptr;
        }
        size++;
    }

    /**
     * Function to insert values at the give position
     * @param value
     * @param pos
     */
    public void insertAtPosition(int value, int pos) {
        Node nptr = new Node(value, null, null);
        if (pos == 1) {
            insertAtStart(value);
            return;
        }
        Node ptr = start;
        for (int i = 2; i<size; i++) {
            if (i == pos){
                Node tmp = ptr.getNext();
                ptr.setNext(nptr);
                nptr.setPrev(ptr);
                nptr.setNext(tmp);
                tmp.setPrev(nptr);
                break;
            }
            ptr = ptr.getNext();
        }
        size++;
    }

    public void deleteAtPosition(int pos) {
        if (pos == 1) {
            if (size == 1) {
                start = null;
                end = null;
                size = 0;
                return;
            }
            start = start.getNext();
            start.setPrev(null);
            size--;
            return;
        }
        if (pos == size) {
            end = end.getPrev();
            end.setNext(null);
            size--;
            return;
        }
        Node ptr = start.getNext();
        for (int i = 2; i< size; i++) {
            if (i == pos) {
                Node next = ptr.getNext();
                ptr = ptr.getPrev();
                ptr.setNext(next);
                next.setPrev(ptr);
                size--;
                return;
            }
            ptr = ptr.getNext();
        }
    }

    public void display(){

        System.out.print("\nDoubly Linked List = ");

        if (size == 0)

        {

            System.out.print("empty\n");

            return;

        }

        if (start.getNext() == null)

        {

            System.out.println(start.getData() );

            return;

        }

        Node ptr = start;

        System.out.print(start.getData()+ " <-> ");

        ptr = start.getNext();

        while (ptr.getNext() != null)

        {

            System.out.print(ptr.getData()+ " <-> ");

            ptr = ptr.getNext();

        }

        System.out.print(ptr.getData()+ "\n");

    }







}
