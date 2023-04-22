import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_human = scanner.nextInt();
        int Q_event = scanner.nextInt();

        deque = new ArrayDeque<>();

        for (int i = 0; i < Q_event; i++) {
            int orderType = scanner.nextInt();
            if (orderType == 3) {
                System.out.println(deque.peekFirst());
                continue;
            }
            solve(orderType, scanner);

        }

        // スキャナーを閉じる
        scanner.close();

    }

    static Deque<Integer> deque;
    static Integer human = 1;

    // 解答を求めるメソッド
    public static void solve(int orderType, Scanner scanner) {

        if (orderType == 1) {
            deque.add(human);
            human++;
        } else {
            int goNo = scanner.nextInt();
            Deque<Integer> tmpDeque = new ArrayDeque<>();
            for (int i : deque) {
                if (i == goNo) {
                    continue;
                }
                tmpDeque.add(i);
            }
            deque = tmpDeque;

        }

    }
}
