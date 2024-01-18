package easy;

//basically fibonacci number
class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(6));
        System.out.println(climbStairs(7));
    }

    private static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        // Create an array to store the number of ways to reach each step
        int[] ways = new int[n + 1];

        // Base cases: there is 1 way to reach the first step, and 2 ways to reach the second step
        ways[1] = 1;
        ways[2] = 2;

        // Fill the array using dynamic programming to find the number of ways for each step
        for (int i = 3; i <= n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }

        // The result is stored in the last element of the array
        return ways[n];
    }

    private static int climbStairsRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
    }
}
