package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }

    private static int[] twoSum(int[] nums, int target) {
        // Create a map to store the complements and their corresponding indices
        Map<Integer, Integer> complements = new HashMap<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement needed to reach the target
            int complement = target - nums[i];

            // Check if the complement is already in the map
            Integer complementIndex = complements.get(complement);

            // If found, return the indices of the two numbers
            if (complementIndex != null) {
                return new int[]{complementIndex, i};
            }

            // Otherwise, add the current number and its index to the map
            complements.put(nums[i], i);
        }

        // If no pair is found, return an empty array
        return new int[]{};
    }
}
