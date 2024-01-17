package easy;

import java.util.HashMap;
import java.util.Map;

class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MDCCCXCIV"));
    }

    private static int romanToInt(String s) {
        Map<Character, Integer> romans = new HashMap<>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && romans.get(s.charAt(i)) < romans.get(s.charAt(i + 1))) {
                result -= romans.get(s.charAt(i));
            } else {
                result += romans.get(s.charAt(i));
            }
        }
        return result;
    }
}
