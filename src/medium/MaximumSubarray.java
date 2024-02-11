package medium;

class MaximumSubarray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{1}));
    }

    //Kadane's algorithm
    private static int maxSubArray(int[] nums) {
        int currentMaxSum = nums[0];
        int overallMaxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMaxSum = Math.max(currentMaxSum + nums[i], nums[i]);
            overallMaxSum = Math.max(currentMaxSum, overallMaxSum);
        }
        return overallMaxSum;
    }

    private static int maxSubArrayBruteForce(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                maxSum = Math.max(currentSum, maxSum);
            }
        }
        return maxSum;
    }
}
