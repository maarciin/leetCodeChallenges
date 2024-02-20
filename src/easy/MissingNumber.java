package easy;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3, 0, 1}));
        System.out.println(missingNumber(new int[]{0, 1}));
        System.out.println(missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    public static int missingNumber(int[] nums) {
        return nums.length * (nums.length + 1) / 2 - Arrays.stream(nums).sum();
    }
}
