package leetCode75;

class StringCompression {
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a'}));
    }

    public static int compress(char[] chars) {
        int write = 0, read = 0;
        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }
            chars[write++] = currentChar;
            if (count > 1) {
                char[] charsInCount = Integer.toString(count).toCharArray();
                for (char c : charsInCount) {
                    chars[write++] = c;
                }
            }

        }
        return write;
    }
}
