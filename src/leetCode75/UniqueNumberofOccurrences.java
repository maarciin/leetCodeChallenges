package leetCode75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class UniqueNumberofOccurrences {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
        System.out.println(uniqueOccurrences(new int[]{1, 2}));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> numOccurrences = new HashMap<>();
        for (int num : arr) {
            numOccurrences.put(num, numOccurrences.getOrDefault(num, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        for (Integer value : numOccurrences.values()) {
            if (!set.add(value)) {
                return false;
            }
        }
        return true;
    }

}
