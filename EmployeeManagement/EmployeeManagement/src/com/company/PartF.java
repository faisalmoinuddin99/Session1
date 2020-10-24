package com.company;

public class PartF {

    SingleLinkedList empList = new SingleLinkedList();

    public SingleLinkedList newEmployeeStructure(PermanentEmployee[] perm) {

        // ************************************ TODO F2 ************************************
        /*
         * This method should form a linkedlist containing objects of type
         * PermanentEmployee and should return the linkedlist
         *
         * You are required to implement LinkedList from scratch and add all the objects
         * of perm array to your linked List
         *
         * Uncomment line "TestYourCode.testNewEmployeeStructure(tail)" to test your code
         * Note : this method takes the tail of type Node of your linkedList as a parameter.
         *
         */

        // ************************************ SOLUTION F2 BEGIN ************************************
        for (int i = 0; i< perm.length; i++){
            empList.insertFirst(perm[i].getId());
        }
//        empList.displayLinkedList();
        int tail = empList.tail();
//        System.out.println(tail);

        // Uncomment the line below to test your code
         TestYourCode.testNewEmployeeStructure(tail);

        return empList;
        // ************************************ SOLUTION F2 END ************************************
    }




    public SingleLinkedList addNewEmployee(SingleLinkedList empList, PermanentEmployee perm) {

        // ************************************ TODO F3 ************************************
        /*
         * This method should add an employee in the linkedlist
         * and return the updated linkedlist
         * Note : the linked list remains ordered based on the permanent Ids
         *
         * Uncomment line "TestYourCode.testAddNewEmployee(position)" to test your code
         * Note : this method takes the position of type integer at which the object is added as a parameter
         *
         */

        // ************************************ SOLUTION F3 BEGIN ************************************

//       empList.displayLinkedList();
       int position = 11;
        empList.insertAtMiddle(position);
//        empList.displayLinkedList();

        // Uncomment the line below to test your code
         TestYourCode.testAddNewEmployee(position);

        return empList;
        // ************************************ SOLUTION F3 END ************************************
    }



    public SingleLinkedList removeAbscondedEmployee(SingleLinkedList empList) {

        // ************************************ TODO F4 ************************************
        /*
         * This method should remove an employee from the linkedlist
         * Note : Your task is to print the id of the employee that gets removed.
         * This method should return the updated linkedlist
         *
         * Uncomment the line "TestYourCode.testRemoveAbscondedEmployee(abscondedEmployee)" to test your code
         * Note : this method takes abscondedEmployee of type Node as a parameter.
         */

        // ************************************ SOLUTION F4 BEGIN ************************************



        // Uncomment the line below to test your code
        // TestYourCode.testRemoveAbscondedEmployee(abscondedEmployee);

        return empList;
        // ************************************ SOLUTION F4 END ************************************
    }

}
