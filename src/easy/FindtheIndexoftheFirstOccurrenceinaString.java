package easy;

class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        System.out.println(strStrWithIndexOf("sadbutsad", "sad"));
        System.out.println(strStrWithIndexOf("leetcode", "leeto"));
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));
    }

    private static int strStrWithIndexOf(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    private static int strStr(String haystack, String needle) {
        final int haystackLength = haystack.length();
        final int needleLength = needle.length();
        if (haystackLength < needleLength) return -1;

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

}
