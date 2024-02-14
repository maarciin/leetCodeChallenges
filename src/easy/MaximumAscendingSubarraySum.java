package easy;

class MaximumAscendingSubarraySum {
    public static void main(String[] args) {
        System.out.println(maxAscendingSum(new int[]{12, 17, 15, 13, 10, 11, 12, 8}));
        System.out.println(maxAscendingSum(new int[]{10, 20, 30, 5, 10, 50}));
        System.out.println(maxAscendingSum(new int[]{10, 20, 30, 40, 50, 60}));
        System.out.println(maxAscendingSum(new int[]{3, 6, 10, 1, 8, 9, 9, 8, 9}));
        System.out.println(maxAscendingSum(new int[]{-5, -10, 100}));
    }

    static int maxAscendingSum(int[] nums) {
        int currentMaxSum = nums[0];
        int overallMaxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentMaxSum += nums[i];
            } else {
                currentMaxSum = nums[i];
            }
            overallMaxSum = Math.max(currentMaxSum, overallMaxSum);
        }
        return overallMaxSum;
    }
}
