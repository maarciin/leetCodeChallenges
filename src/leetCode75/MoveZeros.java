package leetCode75;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        moveZeroes(new int[]{0, 0, 1, 2, 3, 5, 7, 0, 0});
    }

    public static void moveZeroes(int[] nums) {
        int nonZeros = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[nonZeros++] = num;
            }
        }
        while (nonZeros < nums.length) {
            nums[nonZeros++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
