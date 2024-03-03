package leetCode75;

class FindPivotIndex {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        System.out.println(pivotIndex(new int[]{1, 2, 3}));
        System.out.println(pivotIndex(new int[]{2, 1, -1}));
    }

    static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; leftSum += nums[i++]) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
        }

        return -1;
    }
}
