package easy;

class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));

        System.out.println(isPalindromeWithoutConvertingToString(121));
        System.out.println(isPalindromeWithoutConvertingToString(-121));
        System.out.println(isPalindromeWithoutConvertingToString(10));
    }

    private static boolean isPalindrome(int x) {
        String xString = Integer.toString(x);
        for (int i = 0; i < xString.length() / 2; i++) {
            if (xString.charAt(i) != xString.charAt(xString.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindromeWithoutConvertingToString(int x) {
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int reversed = 0;
        for (int temp = x; temp > 0; temp /= 10) {
            reversed = reversed * 10 + temp % 10;
        }
        return x == reversed;
    }
}
