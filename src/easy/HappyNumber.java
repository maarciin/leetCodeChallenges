package easy;

import java.util.HashSet;

class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }

    private static boolean isHappy(int num) {
        HashSet<Integer> seen = new HashSet<>();
        while (num != 1 && !seen.contains(num)) {
            seen.add(num);
            num = addSquaredDigitsInANumber(num);
        }
        return num == 1;
    }

    private static int addSquaredDigitsInANumber(int num) {
        int squaredDigitsSum = 0;
        while (num > 0) {
            int digit = num % 10;
            squaredDigitsSum += digit * digit;
            num /= 10;
        }
        return squaredDigitsSum;
    }
}
