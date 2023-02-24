import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int T_number = scanner.nextInt();
        for (int i = 0; i < T_number; ++i) {
            System.out.println(solve(scanner));
        }

        // スキャナーを閉じる
        scanner.close();
    }

    // 解答を求めるメソッド
    public static int solve(Scanner scanner) {

        int N_number = scanner.nextInt();
        int D_number = scanner.nextInt();
        int K_number = scanner.nextInt();

        if (K_number == 1) {
            return 0;
        }

        int now = 0;
        int result = 0;
        for (int i = 0; i < K_number - 1; ++i) {

            now += D_number;

            if (now % N_number == 0) {
                now += 1;
            }

        }
        result = now % N_number;

        return result;
    }
}
