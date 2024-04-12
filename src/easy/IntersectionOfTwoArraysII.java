package easy;

import java.util.*;

class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new IntersectionOfTwoArraysII().intersect(new int[]{1, 2, 2, 2, 1}, new int[]{2, 2})));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> occurrencesMap = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();

        Arrays.stream(nums1)
                .forEach(num -> occurrencesMap.put(num, occurrencesMap.getOrDefault(num, 0) + 1));

        for (int num : nums2) {
            if (occurrencesMap.getOrDefault(num, 0) > 0) {
                resultList.add(num);
                occurrencesMap.put(num, occurrencesMap.get(num) - 1);
            }
        }

        return resultList.stream().mapToInt(i -> i).toArray();
    }

}
