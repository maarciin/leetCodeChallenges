package leetCode75;

class GreatestCommonDivisorofStrings {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("IIII", "II"));
    }

    //Input: str1 = "ABABAB", str2 = "ABAB"
    //Output : "AB"
    private static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";
        return str1.substring(0, findGCD(str1.length(), str2.length()));
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
