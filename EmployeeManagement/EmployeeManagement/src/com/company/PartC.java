package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PartC {
    public PermanentEmployee[] getHighestToMedianSalary(PermanentEmployee[] perm) {
        // ************************************ TODO C1 ************************************
        /*
         * This method should print the ratio of Highest Salary to Median Salary of the permanent employees
         *
         * This method should return a sorted array of the PermanentEmployee, based on compensation.
         *
         *
         * Uncomment the line "TestYourCode.testHighestToMedianSalary(ratio)" to test your code
         * Note : Pass the desired ratio as a float value
         */

        // ************************************ SOLUTION C1 BEGIN ************************************

//        for(int i = 0 ; i < perm.length;i++){
//            System.out.print(perm[i].getCompensation() + " ");
//        }
       int len = perm.length;
        ArrayList<Integer> compansation = new ArrayList<Integer>();
        for(int i = 0 ; i < perm.length;i++){
            compansation.add(perm[i].getCompensation());
        }

//        for(int x : compansation){
//            System.out.print(x + " ");
//
//        }
//        System.out.println("\n");
        Collections.sort(compansation);
//        System.out.println(compansation + " ");

        int[] SortedCompensation = new int[perm.length];

        for (int i =0; i < len; i++)
            SortedCompensation[i]  = compansation.get(i);
//        System.out.println("\n");

        for (int i =0; i < len; i++){
//            System.out.print(SortedCompensation[i]+" ");
        }


        int low = 0;
        int high = SortedCompensation.length - 1;
        int mid = low + (high - low) / 2;
//        System.out.println("\n");
//        System.out.println(SortedCompensation[mid]);
//        System.out.println(SortedCompensation[high]);

        float ratio = (float) SortedCompensation[high] / SortedCompensation[mid];


        // Uncomment the line below to test your code
         TestYourCode.testHighestToMedianSalary(ratio);

        return perm;

        // ************************************ SOLUTION C1 END ************************************
    }
}
