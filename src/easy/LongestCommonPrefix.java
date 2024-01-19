package easy;

import java.util.Arrays;

class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println("1: " + longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println("2: " + longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    private static String longestCommonPrefix(String[] strs) {
        StringBuilder longestCommonPrefix = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return longestCommonPrefix.toString();
            }
            longestCommonPrefix.append(first.charAt(i));
        }
        return longestCommonPrefix.toString();
    }

}
