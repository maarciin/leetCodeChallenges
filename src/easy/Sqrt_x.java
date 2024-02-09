package easy;

class Sqrt_x {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(99));
        System.out.println(mySqrt(1025));
        System.out.println(mySqrt(2147395600));

    }

    private static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int left = 1;
        int right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid * mid == x) {
                return mid;
            }
            if ((long) mid * mid > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}
