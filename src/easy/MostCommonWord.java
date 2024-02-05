package easy;

import java.util.*;

class MostCommonWord {
    public static void main(String[] args) {

        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
        System.out.println(mostCommonWord("a.", new String[]{}));
        System.out.println(mostCommonWord("a, a, a, a, b,b,b,c, c", new String[]{"a"}));

    }

    private static String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedWords = new HashSet<>(Arrays.asList(banned));

        String[] searchedWords = paragraph.toLowerCase().replaceAll("[^a-z\\s]", " ").trim().split(" ");
        Map<String, Integer> wordsOccurrences = new HashMap<>();

        for (String word : searchedWords) {
            if (!bannedWords.contains(word) && !word.isEmpty()) {
                wordsOccurrences.put(word, wordsOccurrences.getOrDefault(word, 0) + 1);
            }
        }

        return wordsOccurrences.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

    }
}
