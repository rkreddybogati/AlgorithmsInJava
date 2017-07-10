package com.rk.linkedlists;

/**
 * Created by rbhogati on 10/7/17.
 */
public class LinkedList {

    private Node start;
    private Node end;
    private int size;

    public LinkedList() {
        start = null;
        end = null;
        size = 0;
    }

    public boolean isEmpty(){
        return start == null;
    }

    public int getSize(){
        return size;
    }

    // Add Node at Start
    public void insertAtSrart(int value){
        Node nptr = new Node(value, null);
        size++;
        if (start == null) {
            start = nptr;
            end = start;
        } else {
            nptr.setNextLink(start);
            start = nptr;
        }
    }

    // Add Node at End
    public void insertAtEnd(int value){
        Node nptr = new Node(value, null);
        size++;
        if(start == null){
            start = nptr;
            end = start;
        } else {
            end.setNextLink(nptr);
            end = nptr;
        }
    }

    // Insert Node at some position
    public void insertAtPostion(int value, int pos){
        Node nptr = new Node(value, null);
        Node ptr = start;
        pos = pos - 1;
        for (int i=1; i<size; i++){
            if(i == pos){
                Node tmp = ptr.getNextLink();
                ptr.setNextLink(nptr);
                nptr.setNextLink(tmp);
                break;
            }
            ptr = ptr.getNextLink();
        }
        size++;
    }

    // Delete Node at some position
    public void deleteAtPosition(int pos){
        if(pos == 1){
            start = start.getNextLink();
            size--;
            return;
        }
        if(pos == size){

            Node s = start;
            Node t = start;
            while(s != end){
                t = s;
                s = s.getNextLink();
            }
            end = t;
            end.setNextLink(null);
            size--;
            return;
        }
        Node ptr = new Node();
        pos = pos - 1;
        for (int i = 1; i<size; i++) {
            if (i == pos) {
                Node tmp = ptr.getNextLink();
                tmp = tmp.getNextLink();
                ptr.setNextLink(tmp);
                break;
            }
            ptr = ptr.getNextLink();
        }
        size--;
    }

    public void display(){
        System.out.print("Singly LinkedList Dispaying Down.");
        if (size == 0) {
            System.out.print("No Value");
            return;
        } if (start.getNextLink() == null) {
            System.out.print("Data : " + start.getData());
            return;
        }
        Node ptr = start;
        System.out.print("Data: "+ start.getData()+ "->");
        ptr = start.getNextLink();
        while (ptr.getNextLink() != null) {
            System.out.print(""+ptr.getData()+"->");
            ptr = ptr.getNextLink();
        }
        System.out.print(""+ptr.getData()+"\n");
    }




}
