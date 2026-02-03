package prep.interview.architect;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RateLimiterCoding {
    public static void main(String[] args) throws InterruptedException {
        RateLimiter rateLimiter = new RateLimiter(3, 1000); // 3 requests per 1000 ms
        String userId = "user1";

        for (int i = 0; i < 10; i++) {
            boolean allowed = rateLimiter.allowRequest(userId);
            System.out.println("Request " + (i + 1) + " allowed: " + allowed);
           Thread.sleep(200); // Simulate time between requests
        }
    }

}
class RateLimiter {
    private final int limit;
    private final long windowMs;
    private final Map<String, Deque<Long>> userMap = new ConcurrentHashMap<>();

    public RateLimiter(int limit, long windowMs) {
        this.limit = limit;
        this.windowMs = windowMs;
    }

    public synchronized boolean allowRequest(String userId) {
        long now = System.currentTimeMillis();
        userMap.putIfAbsent(userId, new LinkedList<>());
        Deque<Long> q = userMap.get(userId);

        while (!q.isEmpty() && now - q.peekFirst() > windowMs) {
            q.pollFirst();
        }

        if (q.size() < limit) {
            q.addLast(now);
            return true;
        }
        return false;
    }
}