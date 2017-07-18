package com.rk.linkedlists.circular;

/**
 * Created by rbhogati on 10/7/17.
 */
public class Node {

    protected int data;
    protected Node nextLink;


    public Node(){
        data = 0;
        nextLink = null;
    }

    public Node(int d, Node n){
        data = d;
        nextLink = n;
    }


    public int getData() {
        return data;
    }

    public void setData(int i) {
        this.data = i;
    }

    public Node getNextLink() {
        return nextLink;
    }

    public void setNextLink(Node nextLink) {
        this.nextLink = nextLink;
    }
}
