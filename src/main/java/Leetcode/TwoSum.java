package Leetcode;

import java.util.Hashtable;

public class TwoSum {
    public static int[] Solve(int[] nums, int target) {

        Hashtable<Integer, Integer> hashtable = new Hashtable<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hashtable.containsKey(complement)) {
                return new int[]{hashtable.get(complement), i};
            }
            else {
                hashtable.put(nums[i], i);
            }

            System.out.print(hashtable);
        }

        return new int[]{0};
    }
}
