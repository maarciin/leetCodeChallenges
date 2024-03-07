package leetCode75;

class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
        System.out.println(longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
    }

    //sliding window approach
    static int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                k--;
            }
            if (k < 0) {
                if (nums[left] == 0) {
                    k++;
                }
                left++;
            }
            right++;
        }
        return right - left;
    }
}
