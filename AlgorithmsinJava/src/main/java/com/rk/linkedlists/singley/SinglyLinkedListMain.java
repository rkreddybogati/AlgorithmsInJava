package com.rk.linkedlists.singley;

import java.util.Scanner;

/**
 * Created by rbhogati on 10/7/17.
 */
public class SinglyLinkedListMain {


    public static void main(String[] args)

    {

        Scanner scan = new Scanner(System.in);

        /* Creating object of class linkedList */

        SinglyLinkedList list = new SinglyLinkedList();

        System.out.println("Singly Linked List Test\n");

        char ch;

        /*  Perform list operations  */

        do

        {

            System.out.println("\nSingly Linked List Operations\n");

            System.out.println("1. insert at begining");

            System.out.println("2. insert at end");

            System.out.println("3. insert at position");

            System.out.println("4. delete at position");

            System.out.println("5. check empty");

            System.out.println("6. get size");

            int choice = scan.nextInt();

            switch (choice)

            {

                case 1:

                    System.out.println("Enter integer element to insert");

                    list.insertAtSrart(scan.nextInt());

                    break;

                case 2:

                    System.out.println("Enter integer element to insert");

                    list.insertAtEnd(scan.nextInt());

                    break;

                case 3:

                    System.out.println("Enter integer element to insert");

                    int num = scan.nextInt();

                    System.out.println("Enter position");

                    int pos = scan.nextInt();

                    if (pos <= 1 || pos > list.getSize())

                        System.out.println("Invalid position\n");

                    else

                        list.insertAtPostion(num, pos);

                    break;

                case 4:

                    System.out.println("Enter position");

                    int p = scan.nextInt();

                    if (p < 1 || p > list.getSize())

                        System.out.println("Invalid position\n");

                    else

                        list.deleteAtPosition(p);

                    break;

                case 5:

                    System.out.println("Empty status = " + list.isEmpty());

                    break;

                case 6:

                    System.out.println("Size = " + list.getSize() + " \n");

                    break;

                default:

                    System.out.println("Wrong Entry \n ");

                    break;

            }

            /*  Display List  */

            list.display();

            list.reverseLinkedList();
            System.out.println("\n\n"+ "---Reversed Linked List below--");
            list.display();
            System.out.println("\n\n"+ "--- Ends--");

            list.reverseLinkedList();

            // Reverse linked list
            //ReverseLinkedList.displayLinkedList(ReverseLinkedList.reverseLinkedList(list.getStart()));


            System.out.println("\nDo you want to continue (Type y or n) \n");

            ch = scan.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');

    }


}
