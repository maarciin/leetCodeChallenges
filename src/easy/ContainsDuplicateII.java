package easy;

import java.util.HashSet;
import java.util.Set;

class ContainsDuplicateII {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicateBruteForce(new int[]{1, 2, 3, 1}, 3));
        System.out.println(containsNearbyDuplicateBruteForce(new int[]{1, 0, 1, 1}, 1));
        System.out.println(containsNearbyDuplicateBruteForce(new int[]{1, 2, 3, 1, 2, 3}, 2));

        System.out.println(containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

    //brute force - O(n^2)
    private static boolean containsNearbyDuplicateBruteForce(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //O(n)
    private static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                window.remove(nums[i - k - 1]);
            }
            if (window.contains(nums[i])) {
                return true;
            }
            window.add(nums[i]);
        }
        return false;
    }
}
