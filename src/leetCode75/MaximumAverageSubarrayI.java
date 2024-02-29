package leetCode75;

class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
        System.out.println(findMaxAverage(new int[]{5}, 1));
    }

    static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            int currentSum = maxSum + nums[i] - nums[i - k];
            maxSum = Math.max(currentSum, maxSum);
        }
        return (double) maxSum / k;
    }

}
