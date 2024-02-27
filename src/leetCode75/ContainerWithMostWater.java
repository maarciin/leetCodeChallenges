package leetCode75;

class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(maxArea(new int[]{2, 1}));
        System.out.println(maxArea(new int[]{1, 3, 2, 5, 25, 24, 5}));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int overallMaxWater = 0;

        while (left < right) {
            int currentMaxWater = Math.min(height[left], height[right]) * (right - left);
            overallMaxWater = Math.max(overallMaxWater, currentMaxWater);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return overallMaxWater;
    }
}
