package easy;

import java.util.HashMap;
import java.util.Map;

class FirstUniqueCharacterinaString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));

    }

    private static int firstUniqChar(String s) {
        Map<Character, Integer> characterOccurrences = new HashMap<>();
        for (char character : s.toCharArray()) {
            characterOccurrences.put(character, characterOccurrences.getOrDefault(character, 0) + 1);
        }
        for (int i = 0; i < s.toCharArray().length; i++) {
            if (characterOccurrences.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
