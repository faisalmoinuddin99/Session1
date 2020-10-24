package com.company;

// ************************************ TODO G1 ************************************
/*
 * Implement a Queue and its basic operations using LinkedList
 */

class QueueNode {
 int id;
 QueueNode next;
}
public class Queue {

// ************************************ SOLUTION G1 BEGIN ************************************

 QueueNode front = null;
 QueueNode rear = null;

 // ************************************ SOLUTION G1 END ************************************
 public boolean isEmpty(){
  if (front == null && rear == null){
   return true;
  }else
   return false;
 }
 public void enqueue(int element){
  QueueNode nn = new QueueNode();
  nn.id = element;
  nn.next = null;

  if (front == null){
   front = nn;
  }else{
   rear.next = nn;
  }
  rear = nn;
 }

 public void dequeue(){
  if (isEmpty())
   System.out.println("Queue is empty");
  else {
   if (front == rear){
    front = rear = null;
   }else{
    QueueNode ptr = front;
    front = front.next;
   }
  }
 }

 public void display(){
  if (isEmpty()){
   System.out.println("Queue is empty");
  }else{
   QueueNode tn = front;
   while (tn != null){
    System.out.println(tn.id);
    tn = tn.next;
   }
  }
 }

}
