package easy;

class LengthofLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWordWithSplit("Hello World"));
        System.out.println(lengthOfLastWordWithSplit("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWordWithSplit("uffy is still joyboy"));
        System.out.println(lengthOfLastWordWithoutSplit("Hello World"));
        System.out.println(lengthOfLastWordWithoutSplit("u   fly me   to   the moon  "));
        System.out.println(lengthOfLastWordWithoutSplit("uffy is still joyboy"));
    }

    private static int lengthOfLastWordWithSplit(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }

    private static int lengthOfLastWordWithoutSplit(String s) {
        s = s.trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return count;
            } else {
                count++;
            }
        }
        return count;
    }
}
