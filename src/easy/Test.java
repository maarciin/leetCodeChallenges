package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Test {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(1212));

        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }

    static boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int reversed = 0;
        int temp = x;
        while (temp != 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }

//        for (int temp = x; temp > 0; temp /= 10) {
//            reversed = reversed * 10 + temp % 10;
//        }
        return reversed == x;
    }

    private static int[] twoSum(int[] nums, int target) {
        // Create a map to store the complements and their corresponding indices
        Map<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            Integer complementIndex = complements.get(complement);
            if (complementIndex != null) {
                return new int[]{complementIndex, i};
            }
            complements.put(nums[i], i);
        }
        return new int[]{};
    }
}