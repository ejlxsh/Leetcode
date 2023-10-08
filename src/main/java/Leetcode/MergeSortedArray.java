package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {
    public static int[] solve(int[] nums1, int m, int[] nums2, int n) {
        int iM = 0;
        int iN = 0;
        List<Integer> mergedList = new ArrayList<>();

        if (m == 0) {
            return nums2;
        }

        if (n == 0) {
            return nums1;
        }

        while (iM < m || iN < n) {
            if (iM == m) {
                mergedList.add(nums2[iN]);
                iN++;
            }
            else if (iN == n) {
                mergedList.add(nums1[iM]);
                iM++;
            }
            else if (nums1[iM] <= nums2[iN]) {
                mergedList.add(nums1[iM]);
                iM++;
            }
            else {
                mergedList.add(nums2[iN]);
                iN++;
            }
        }

        return mergedList.stream().mapToInt(i->i).toArray();
    }
}
