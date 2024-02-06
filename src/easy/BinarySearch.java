package easy;

class BinarySearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{5}, 5));
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }

    private static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) {
                left = ++mid;
            } else {
                right = --mid;
            }
        }
        return -1;
    }
}
