package Leetcode;

import java.util.Hashtable;

public class TwoSum {
    public static int[] solve(int[] nums, int target) {

        Hashtable<Integer, Integer> hashtable = new Hashtable<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hashtable.containsKey(complement)) {
                return new int[]{hashtable.get(complement), i};
            }
            else {
                hashtable.put(nums[i], i);
            }
        }

        return new int[]{0};
    }
}
