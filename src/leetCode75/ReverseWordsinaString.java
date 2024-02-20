package leetCode75;

class ReverseWordsinaString {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
    }

    public static String reverseWords(String s) {
        String[] strings = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0 ; i--) {
            sb.append(strings[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
