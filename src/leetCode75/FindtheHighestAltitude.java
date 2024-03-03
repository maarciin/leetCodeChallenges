package leetCode75;

class FindtheHighestAltitude {
    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5, 1, 5, 0, -7}));
        System.out.println(largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
    }

    static int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = currentAltitude;

        for (int alt : gain) {
            currentAltitude += alt;
            maxAltitude = Math.max(currentAltitude, maxAltitude);
        }

        return maxAltitude;
    }
}
