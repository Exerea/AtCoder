import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();
        int M_number = scanner.nextInt();

        // Sを入力
        Queue<Integer> queue = new LinkedList<>();
        Deque<Integer> stock = new LinkedList<>();
        ArrayList<Integer> reList = new ArrayList<>();

        for (int i = 0; i < M_number; i++) {
            int a = scanner.nextInt();
            reList.add(a);
        }

        for (Integer i = 1; i < N_number + 1; i++) {

            if (reList.contains(i)) {
                stock.offer(i);
            } else {
                if (!stock.isEmpty()) {
                    queue.offer(i);
                    while (!stock.isEmpty()) {
                        queue.offer(stock.pollLast());
                    }
                } else {
                    queue.offer(i);
                }

            }
        }

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        // スキャナーを閉じる
        scanner.close();
    }
}
