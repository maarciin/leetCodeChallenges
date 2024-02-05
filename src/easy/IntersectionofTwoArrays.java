package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class IntersectionofTwoArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();
        for (int num : nums1) {
            firstSet.add(num);
        }

        for (int num : nums2) {
            if (firstSet.contains(num)) {
                secondSet.add(num);
            }
        }

        int[] resultArray = new int[secondSet.size()];

        int i = 0;
        for (Integer num : secondSet) {
            resultArray[i++] = num;
        }
        return resultArray;
    }
}
