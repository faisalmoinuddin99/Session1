package com.company;

import java.util.Arrays;

public class PartE {

    public void getFrequencyOfVisitedWebsites(String[] browsingHistory, String[] restrictedWebsites) {
        // ************************************ TODO E1 ************************************
        /*
         * This method should print :
         * <<WebsiteName>>:<<Frequency>>
         * <<WebsiteName>>:<<Frequency>>
         *
         * For Example :  Instagram:3
         * 				  Facebook:0
         *
         * Pass the frequency in an array in order of the websites.
         *
         * Uncomment the line "TestYourCode.testFrequencyOfVisitedWebsites(restrictedWebsites,freq)" to test your code
         * Note : 	restrictedWebsites is String array given
         * 			freq is an integer array which contains the frequency of corresponding restrictedWebsites
         */
        // ************************************ SOLUTION E1 BEGIN ************************************


        int [] freq = answerQueries(browsingHistory, restrictedWebsites);
        // Uncomment the line below to test your code
        TestYourCode.testFrequencyOfVisitedWebsites(restrictedWebsites,freq);



        // Uncomment the line below to test your code
        // TestYourCode.testFrequencyOfVisitedWebsites(restrictedWebsites,freq);

        // ************************************ SOLUTION E1 END ************************************
    }


    public void findSimilarNamedTeams(PermanentEmployee[] perm) {
        // ************************************ TODO E2 ************************************
        /*
         * This method should print number of teams
         *
         * Uncomment the line "TestYourCode.testSimilarNamedTeam(count)" to test your code
         * Note : Here, count is an integer data type storing the number of teams that can be formed.
         */

        // ************************************ SOLUTION E2 BEGIN ************************************
       String [] name = new String[perm.length];
        for (int i =0 ;i < perm.length; i++){
            name[i] = perm[i].getName().toLowerCase();
        }
        Arrays.sort(name);

        int count = 0;
        for(int i = 0 ; i < name.length - 1; i++){
            if(isAnagram(name[i], name[i+1]))
                count++;
        }

        // Uncomment line below to test your code
         TestYourCode.testSimilarNamedTeams(count);

        //************************************ SOLUTION E2 END ************************************
    }

    static boolean isAnagram(String s1, String s2)
    {
        String str1 = new String(s1);
        String str2 = new String(s2);

        // Ensures that both strings are of the same length
        if (str1.length() != str2.length())
            return false;

        int str1Len = str1.length();
        for (int i = 0; i < str1Len; i++)
        {
            int charIndex = str2.indexOf(str1.charAt(i));

            if(charIndex == -1) // Not found in str2
                return false;
            else
            {
                // Remove the character from str2
                str2 = str2.substring(0, charIndex) +
                        str2.substring(charIndex + 1);
            }
        }

        return true;
    }

    static int search(String[]arr, String s)
    {
        int counter = 0;
        for (int j = 0; j < arr.length; j++)

               /* checking if string given in query is
                 present in the given string. If present,
                 increase times*/
            if (s.equals(arr[j].toLowerCase()))
                counter++;

        return counter;
    }

    public static int[] answerQueries(String[] arr, String[] q)
    {
//        String[] x = {"APPLe", "BaLL", "CaT"};
//        for (int i = 0; i < x.length; i++) {
//            x[i] = x[i].toLowerCase();
//        }

        int[] res = new int [q.length];
//        for (int i=0;i<q.length; i++){
//             res =  new int[]{search(arr,q[i].toLowerCase())} ;
//        }
        for(int i=0; i<q.length; i++) {
            res[i] = search(arr,q[i].toLowerCase());
        }
        return res;

    }

}

