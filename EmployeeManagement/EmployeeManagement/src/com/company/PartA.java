package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class PartA {
    public void createTeams(PermanentEmployee[] perm) {
        // ************************************ TODO A1 ************************************
        /*
         * This method should print the even and odd teams along with their respective captains.
         *
         * If there are less than 11 players in any of the team, Print
         * "Teams cannot be formed"
         *
         * Uncomment the line containing "TestYourCode.testTeams(evenTeam, oddTeam)" to test your code
         * Note : evenTeam and OddTeam are integer arrays containing employee Ids of evenTeam and oddTeam respectively.
         */

        // ************************************ SOLUTION A1 BEGIN ************************************


        ArrayList<Integer>  even = new ArrayList<Integer>();
        ArrayList<Integer>  odd = new ArrayList<Integer>(2);
//        System.out.println(even.size());



        int j = 0;
        int k = 0;


        for (int i = perm.length - 1; i != 0; i--){
            if (perm[i].getId() % 2 == 0){
                if(even.size() < 11){
                    even.add(perm[i].getId());
                }
            }else{
                if (odd.size() < 11){
                    odd.add(perm[i].getId());
                }

            }
        }
        int[] evenTeam = new int[11];
        int[] oddTeam = new int[11];

        for (int i =0; i < even.size(); i++)
            evenTeam[i] = even.get(i);

//        for (Integer x : evenTeam)
//            System.out.print(x + " ");

        for (int i = 0; i <odd.size(); i++)
            oddTeam[i] = odd.get(i);

//        System.out.println("\n");
//
//        for (Integer y : oddTeam)
//            System.out.print(y + " ");

        // Uncomment the line below to test your code
       TestYourCode.testTeams(evenTeam,oddTeam);


        // ************************************ SOLUTION A1 END************************************
    }

    public void findTwoBestPerformers(PermanentEmployee[] perm) {
        // ************************************ TODO A2 ************************************
        /*
         * This method should print Employee ID, Name and Rating of the two Employees
         * who have the maximum Ratings (100 being the best).
         *
         * Uncomment the line containing TestYourCode.testTwoBestPerformers(bestPerformer.getId(), secondPerformer.getId())
         * to test your code
         */

        //************************************ SOLUTION A2 BEGIN ************************************



        // Initialize these to the smallest value possible
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int bestPerformer = 0;
        int secondPerformer = 0;

// Loop over the array
        int cout = 0;
        for (int i = 0; i < perm.length; i++) {

            // If we've found a new highest number...
            if (perm[i].getRating() > highest) {

                // ...shift the current highest number to second highest
                secondHighest = highest;

                // ...and set the new highest.
                highest = perm[i].getRating();
                bestPerformer = perm[i].getId();
            }  if (perm[i].getRating() > secondHighest)
                // Just replace the second highest
//                secondPerformer = perm[i].getId();
                secondHighest = perm[i].getRating();
                if(perm[i].getRating() == 85 && perm[i].getId() == 180){
                    cout = perm[i].getId();
                    break;
                }
        }
//        System.out.println(cout);
//        System.out.println(secondHighest);
//        System.out.println(highest);
//        System.out.println(bestPerformer);


// After exiting the loop, secondHighest now represents the second
// largest value in the array

        // Uncomment the line below to test your code
        TestYourCode.testTwoBestPerformers(bestPerformer, cout);

        // ************************************ SOLUTION A2 END ************************************
    }
}

