package com.company;

public class PartG {

    Queue que = new Queue();

    public Queue lineUpFoodCoupons(int[] registeredEmployees) {
        // ************************************ TODO G2 ************************************
        /*
         * This method should form a Queue containing Ids of Registered Employees
         *
         * This method should print the Id at front and rear in Queue
         *
         *
         * Uncomment line "TestYourCode.testFoodCouponDistribution(frontId, RearId)" to test your code
         * Note : You need to pass the Id of type integer at Front and Rear respectively.
         */

        // ************************************ SOLUTION G2 BEGIN ************************************

        for (int i =0 ;i < registeredEmployees.length; i++){
            que.enqueue(registeredEmployees[i] );
        }
//        System.out.println(que.front.id);
//        System.out.println(que.rear.id);
        //Uncomment the line below to test your code.
        TestYourCode.testFoodCouponDistribution(que.front.id,que.rear.id);

        return que;
        //************************************ SOLUTION G2 END ************************************
    }

    public Queue distributeFoodCoupons(int distributeEmployees) {
        // ************************************ TODO G3 ************************************
        /*
         * This method should remove the Ids from the Queue
         * NOTE : the count of ids to be removed is given by distributeEmployees
         *
         * This method should print the Id at front and rear entry in Queue
         *
         * If number of coupons are more than registeredEmployees,
         * the method should print : "Extra coupons"
         *
         * If number of coupons are equal to the number of registered employees,
         * the menthod should print : "Coupons distributed to all"
         *
         * Uncomment line "TestYourCode.testFoodCouponDistribution(frontId, RearId)" to test your code
         * Note : You need to pass the Id of type integer at Front and Rear respectively.
         */
        // ************************************ SOLUTION G3 BEGIN ************************************
        int count = 0;
        for (int i = 0; i < distributeEmployees; i++){
            que.dequeue();
            count ++;
        }
//        System.out.println(count);

        // Uncomment the line below to test your code.
        TestYourCode.testFoodCouponDistribution(que.front.id, que.rear.id);

        return que;
        //************************************ SOLUTION G3 END ************************************
    }
}
