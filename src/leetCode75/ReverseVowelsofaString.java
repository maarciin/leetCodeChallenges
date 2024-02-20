package leetCode75;

import java.util.Set;

class ReverseVowelsofaString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("asdfu"));
        System.out.println(reverseVowels("MArcin"));
    }

    public static String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int left = 0;
        int right = s.length() - 1;
        char[] characters = s.toCharArray();
        while (left <= right) {
            boolean isLeftVowel = vowels.contains(characters[left]);
            boolean isRightVowel = vowels.contains(characters[right]);
            if (isLeftVowel && isRightVowel) {
                char temp = characters[left];
                characters[left] = characters[right];
                characters[right] = temp;
                left++;
                right--;
            }
            if (!isLeftVowel) {
                left++;
            }
            if (!isRightVowel) {
                right--;
            }
        }
        return String.valueOf(characters);
    }
}
