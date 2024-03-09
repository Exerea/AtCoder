import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nの入力
        int N = scanner.nextInt();

        Deque<Long> queue = new LinkedList<>();

        // 睡眠記録の入力
        for (int i = 0; i < N; i++) {
            queue.add(scanner.nextLong());
        }

        int Q = scanner.nextInt();

        for (int i = 0; i < Q; i++) {
            Deque<Long> useQueue = new LinkedList<>();
            long start = scanner.nextInt();
            long end = scanner.nextInt();
            boolean isEnd = false;

            for (long element : queue) {
                if (isEnd && element > end) {
                    useQueue.pollLast();
                    useQueue.add(end);
                    System.out.println(calc(useQueue));
                    break;
                }

                if (!isEnd && element > start) {
                    useQueue.add(start);
                    isEnd = true;
                }

                if (isEnd) {
                    useQueue.add(element);
                }

            }
        }

        scanner.close();
    }

    public static long calc(Deque<Long> useQueue) {
        long ans = 0;

        for (int i = 0; i < useQueue.size(); i += 2) {

            long begin = useQueue.pollFirst();
            long end = useQueue.pollFirst();
            ans += end - begin;

        }

        return ans;

    }
}