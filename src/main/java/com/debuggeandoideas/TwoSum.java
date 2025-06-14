package com.debuggeandoideas;

import java.sql.Array;
import java.util.Arrays;

public class TwoSum {
    /*
    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]

    Example 3:
    Input: nums = [3,3], target = 6
    Output: [0,1]
     */

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i < nums.length; i++) {
           for(int j=0; j < nums.length; j++) {

               if(i == j) continue;
//               System.out.println(nums[i] + " - " + nums[j]);
//               if( (nums[i]+nums[j]) == target ) return new int[]{nums[i], nums[j]};
               if( (nums[i]+nums[j]) == target ) {
                   System.out.println(nums[i] + " - " + nums[j]);
                   return new int[]{nums[i], nums[j]};
//                   return nums[i];
               }
           }
        }

        throw new RuntimeException();
    }

    public static void main(String[] args) {

        final var result = twoSum(new int[]{2,7,11,15}, 9);
//        System.out.println("result = " + Arrays.toString(result));
    }
}
