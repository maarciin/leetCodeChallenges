package leetCode75;

class MaximumNumberofVowelsinaSubstringofGivenLength {
    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
        System.out.println(maxVowels("aeiou", 2));
        System.out.println(maxVowels("leetcode", 3));
    }

    static int maxVowels(String s, int k) {
        int vowelsCount = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                vowelsCount++;
            }
        }
        int maxVowels = vowelsCount;

        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                vowelsCount++;
            }
            if (isVowel(s.charAt(i - k))) {
                vowelsCount--;
            }
            maxVowels = Math.max(vowelsCount, maxVowels);
        }

        return maxVowels;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'o' || c == 'e' || c == 'i' || c == 'u';
    }
}
