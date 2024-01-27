package easy;

import java.util.Arrays;

class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{4,3,2,1})));
        System.out.println(Arrays.toString(plusOne(new int[]{9,9})));
        System.out.println(Arrays.toString(plusOne(new int[]{1,8,9})));
    }

    private static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
