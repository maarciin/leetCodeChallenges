package leetCode75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class MaxNumberofKSumPairs {
    public static void main(String[] args) {
        System.out.println(maxOperationsHashMap(new int[]{1, 2, 3, 4, 5}, 5));
        System.out.println(maxOperationsHashMap(new int[]{3, 1, 3, 4, 3}, 6));
        System.out.println(maxOperationsTwoPointers(new int[]{1, 2, 3, 4, 5}, 5));
        System.out.println(maxOperationsTwoPointers(new int[]{3, 1, 3, 4, 3}, 6));
    }

    public static int maxOperationsHashMap(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int complement = k - num;
            if (map.containsKey(complement)) {
                count++;
                map.put(complement, map.get(complement) - 1);
                if (map.get(complement) == 0) {
                    map.remove(complement);
                }
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return count;
    }

    static int maxOperationsTwoPointers(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while (left < right) {
            if (nums[left] + nums[right] < k) {
                left++;
            } else if (nums[left] + nums[right] > k) {
                right--;
            } else {
                count++;
                left++;
                right--;
            }
        }
        return count;
    }

}
