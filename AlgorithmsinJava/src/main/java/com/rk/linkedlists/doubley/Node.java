package com.rk.linkedlists.doubley;

/**
 * Created by rbhogati on 12/7/17.
 */
public class Node {

    protected int data;
    protected Node next, prev;

    public Node() {
        data = 0;
        next = null;
        prev = null;
    }

    public Node(int d, Node n, Node p) {
        data = d;
        next = n;
        prev = p;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
