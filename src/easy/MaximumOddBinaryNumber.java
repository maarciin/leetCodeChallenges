package easy;

import java.util.Arrays;

class MaximumOddBinaryNumber {
    public static void main(String[] args) {
        System.out.println(maximumOddBinaryNumberTwoCount("00111"));
        System.out.println(maximumOddBinaryNumberTwoCount("0101"));
    }

    private static String maximumOddBinaryNumberTwoCount(String s) {
        int count1 = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') count1++;
        }
        int count0 = s.length() - count1;
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < count1 - 1; i++) {
            sb.append('1');
        }
        for (int i = count1 - 1; i < s.length() - 1; i++) {
            sb.append('0');
        }
        sb.append('1');
        return sb.toString();

    }

    private static String maximumOddBinaryNumberTwoPointers(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (charArray[left] == '1') {
                left++;
            }
            if (charArray[right] == '0') {
                right--;
            }
            if (left <= right && charArray[left] == '0' && charArray[right] == '1') {
                charArray[left] = '1';
                charArray[right] = '0';
            }
        }
        charArray[left - 1] = '0';
        charArray[s.length() - 1] = '1';

        return String.valueOf(charArray);

    }

    private static String maximumOddBinaryNumberWithSort(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length - 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 2];
            charArray[charArray.length - i - 2] = temp;
        }
        return String.valueOf(charArray);
    }
}
