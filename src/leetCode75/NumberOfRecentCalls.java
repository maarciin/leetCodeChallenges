package leetCode75;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {
    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(100));
        System.out.println(recentCounter.ping(3000));
        System.out.println(recentCounter.ping(3005));
        System.out.println(recentCounter.ping(3500));
        System.out.println(recentCounter.ping(7000));
    }

    public static class RecentCounter {

        Queue<Integer> requests;

        public RecentCounter() {
            this.requests = new LinkedList<>();
        }

        public int ping(int t) {
            requests.offer(t);

            while (!requests.isEmpty() && requests.peek() < t - 3000) {
                requests.poll();
            }

            return requests.size();
        }
    }

}
