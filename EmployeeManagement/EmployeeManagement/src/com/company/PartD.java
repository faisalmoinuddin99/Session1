package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class PartD {
    public ContractEmployee[] getHighestContractSalaries(ContractEmployee[] conSal) {
        // ************************************ TODO D1 ************************************
        /*
         * This method should print the TOP FIVE Compensations of the Contract Employees.
         * This method should return a sorted array of ContractEmployee based on compensation
         *
         * Uncomment the line "TestYourCode.testHighestContractSalaries(topFive)" to test your code
         * Note : topFive is an integer array that consists of all the top 5 Compensations
         *
         * Uncomment the line "TestYourCode.testSortedContractSalaries(conSal)" to test your code
         * Note : conSal is the Sorted Array of Contract Employees
         *
         */
        // ************************************ SOLUTION D1 BEGIN ************************************



        int [] fetchCompensation = new int[conSal.length];

        for (int i = 0; i < conSal.length ; i++){
           fetchCompensation[i] = conSal[i].getCompensation();
        }


        // Sorting Array using Merge Sort
        sort(fetchCompensation,0,conSal.length - 1);

//        int [] topFive = new int[conSal.length];
        ArrayList<Integer>  topFive = new ArrayList<Integer>();



        for (int i = conSal.length -1 ; i !=0 ; i--){



                if (topFive.size() <= 5 ){
                    topFive.add(fetchCompensation[i]) ;
                }else {
                    break;
                }
        }

        int[] newtopFive = new int[5];
        int len = newtopFive.length;
        for (int i = 0; i < len; i++){
            newtopFive[i] = topFive.get(i);
        }



        // Uncomment the line below to test your code
        TestYourCode.testHighestContractSalaries(newtopFive);

        return conSal;
        //************************************ SOLUTION D1 END ************************************
    }


    public void unionOfSalaries(PermanentEmployee[] sortedPerm, ContractEmployee[] sortedCon) {
        // ************************************ TODO D2 ************************************
        /* This method should print the ratio of Highest to Median Compensation of all employees
         *
         *Uncomment the line "TestYourCode.testUniteSalaries(ratio)" to test your code
         *Note : ratio is a float value
         *
         */

        //************************************ SOLUTION D2 BEGIN ************************************
        int first = sortedPerm.length;
        int second = sortedCon.length;

        int [] merge = new int[first + second];
//        System.out.println(merge.length);
//        System.arraycopy(sortedPerm,0,merge,0,first);
//        System.arraycopy(sortedCon,0,merge,first,second);
//
//        // Merging Array
//        System.out.println("\n");
        int cout = 0;
        for (int i = 0; i < sortedPerm.length ; i ++){
            merge[i] = sortedPerm[i].getCompensation();
            cout++;
        }
        for (int j = 0; j < sortedCon.length; j++){
            merge[cout++] = sortedCon[j].getCompensation();
        }

//        System.out.println("After sorting:");
        mergeSort(merge, merge.length);

        int highest = merge.length - 1;
        int low = 0;
        int midean = low + (highest - low) / 2;
//        System.out.println("\n");
//        System.out.println(merge[highest]);
//        System.out.println(merge[midean]);
        float ratio = (float) merge[highest] / merge[midean] ;
//        System.out.println(ratio);




        // Uncomment the line below to test your code
         TestYourCode.testUniteSalaries(ratio);

        //************************************ SOLUTION D2 END ************************************
    }

  public static  void sort(int arr[], int beg, int end)
    {
        if (beg<end)
        {
            int mid = (beg+end)/2;
            sort(arr, beg, mid);
            sort(arr , mid+1, end);
            merge(arr, beg, mid, end);
        }
    }
    public static void merge(int arr[], int beg, int mid, int end)
    {
        int l = mid - beg + 1;
        int r = end - mid;
        int LeftArray[] = new int [l];
        int RightArray[] = new int [r];
        for (int i=0; i<l; ++i)
            LeftArray[i] = arr[beg + i];
        for (int j=0; j<r; ++j)
            RightArray[j] = arr[mid + 1+ j];
        int i = 0, j = 0;
        int k = beg;
        while (i<l&&j<r)
        {
            if (LeftArray[i] <= RightArray[j])
            {
                arr[k] = LeftArray[i];
                i++;
            }
            else
            {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i<l)
        {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }
        while (j<r)
        {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }


}
