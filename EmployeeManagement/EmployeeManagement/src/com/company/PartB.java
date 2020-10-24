package com.company;

import java.util.Arrays;

public class PartB {
    public void searchForAnEmployee(PermanentEmployee[] perm, int id) {
        // ************************************ TODO B1 ************************************
        /*
         * This method should print the contact number of corresponding employee if
         * present else the method should print : "Employee not in the records"
         *
         * Uncomment the line containing "TestYourCode.testSearchForAnEmployee(str)" to test your code
         * Note : str is the contact number of the corresponding employee;
         */

        // ************************************ SOLUTION B1 BEGIN ************************************


//            for (int i = 0; i < perm.length; i++){
//                System.out.println(perm[i].getContact());
//            }
            int low = 0;
            int high = perm.length;
            int mid ;
            String str = "Employee not in the records";
            while(low <= high){
                mid = low + (high - low) / 2;
                if (perm[mid].getId() == id){
                   str = perm[mid].getContact();
                } if (perm[mid].getId() < id){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }

            }

//         Uncomment below line to test your code
         TestYourCode.testSearchForAnEmployee(str);

        // ************************************ SOLUTION B1 END ************************************
    }
}
