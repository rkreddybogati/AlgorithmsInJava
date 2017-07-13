package com.rk.linkedlists.singley;

/**
 * Created by rbhogati on 13/7/17.
 */
public class ReverseLinkedList {



    /**
     * To display linked list we have to traverse from head to
     * @param singleyLinkedListHead
     */
    public static void displayLinkedList(Node singleyLinkedListHead){
        System.out.print("\n\n");
        System.out.print("Reversed Linked List ");
        if (singleyLinkedListHead == null) {
            System.out.print("Reversed Linked List is empty.");
            return;
        }
        if (singleyLinkedListHead != null){
            System.out.print(singleyLinkedListHead.getData() + "->");
        }
    }

}
