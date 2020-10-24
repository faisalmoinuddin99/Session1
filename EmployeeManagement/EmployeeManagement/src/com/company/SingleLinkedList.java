package com.company;



// ************************************ TODO F1 ************************************
/*
 * Implement a Singly linkedList
 *
 */


/**
 *Node class, which holds data and contains next which points to next Node.
 */
class Node<T> {
    public T data; // data in Node.
    public Node<T> next; // points to next Node in list.

    /**
     * Constructor
     */
    public Node(T data){
        this.data = data;
    }

    /**
     * Display Node's data
     */
    public void displayNode() {
        System.out.print( data + " ");
    }
}

public class SingleLinkedList<T>  {

    // ************************************ SOLUTION F1 BEGIN ************************************


    private Node first; // ref to first link on list
    private Node tn; // traverse node
    private Node current;
    private Node n;
    /**
     * LinkedList constructor
     */
    public SingleLinkedList(){
        first = null;
        tn = null;

    }

    /**
     * Insert New Node at first position
     */
    public void insertFirst(T data) {
        Node newNode = new Node<T>(data);  //Creation of New Node.
//        newNode.next = first;   //newLink ---> old first
//        first = newNode;  //first ---> newNode
        newNode.next = null;
        if (first == null){
            first = newNode;
        }else{
            tn = first;
            while (tn.next != null){
                tn = tn.next;
            }
            tn.next =  newNode;
        }
    }
    public void displayLinkedList() {
        System.out.print("Displaying LinkedList [first--->last]: ");
        Node<T> tempDisplay = first; // start at the beginning of linkedList
        while (tempDisplay != null){ // Executes until we don't find end of list.
            tempDisplay.displayNode();
            tempDisplay = tempDisplay.next; // move to next Node
        }
        System.out.println();

    }

    public int  tail(){
        current = first;
        n = current.next;
        int tail = 0;
        if (first == null){
            System.out.println("Linked list is empty");
        }else{
            tn = first;
            while (n != null){
             // fetching tail of linked list
             current = n;
             n = current.next;
            }
//            System.out.println(current.data);

            tail = (int) current.data;
        }
        return tail ;
    }

    void insertAtMiddle(int position){
        int i = 0;

      while ( i != position - 1){
          tn = tn.next;
          i++;
      }


    }

    // ************************************ SOLUTION F1 END ************************************

}


