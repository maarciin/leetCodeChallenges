package easy;

import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> noDuplicates = new HashSet<>();
        for (int num : nums) {
            if (!noDuplicates.add(num)) {
                return true;
            }
        }
        return false;
    }
}
