package leetCode75;

class NthTribonacciNumber {
    public static void main(String[] args) {
        System.out.println(tribonacci(4));
        System.out.println(tribonacci(25));
    }

    static int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        int[] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        array[2] = 1;
        for (int i = 3; i < array.length; i++) {
            array[i] = array[i - 3] + array[i - 2] + array[i - 1];
        }
        return array[n];
    }

}
