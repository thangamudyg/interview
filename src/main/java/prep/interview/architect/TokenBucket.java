package prep.interview.architect;

import java.util.concurrent.atomic.AtomicLong;

class TokenBucket {
    private final long capacity = 10; // max tokens
    private final long refillRate = 3; // tokens per second

    private final AtomicLong tokens = new AtomicLong(capacity);
    private final AtomicLong lastRefill = new AtomicLong(System.nanoTime());


    boolean allow() {
        refill();

        long current;
        do {
            current = tokens.get();
            if (current == 0) return false;
        } while (!tokens.compareAndSet(current, current - 1));

        return true;
    }

    private void refill() {
        long now = System.nanoTime();
        long last = lastRefill.get();
        long tokensToAdd = (now - last) * refillRate / 1_000_000_000L;

        if (tokensToAdd > 0 &&
                lastRefill.compareAndSet(last, now)) {
            tokens.updateAndGet(t ->
                    Math.min(capacity, t + tokensToAdd));
        }
    }
}