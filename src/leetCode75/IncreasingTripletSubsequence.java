package leetCode75;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{1,2,3,4,5}));
        System.out.println(increasingTriplet(new int[]{5,4,3,2,1}));
        System.out.println(increasingTriplet(new int[]{2,1,5,0,6,4}));
    }

    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num; // znajdź najmniejszą wartość
            } else if (num <= second) {
                second = num; // znajdź drugą najmniejszą wartość
            } else {
                return true; // znaleziono rosnący ciąg
            }
        }

        return false; // nie znaleziono rosnącego ciągu
    }
}
