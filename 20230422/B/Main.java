import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();
        int T = scanner.nextInt();

        // Sを入力
        int[] TS = new int[N_number];
        int first = -1;
        boolean have = false;
        for (int i = 0; i < N_number; i++) {

            int num = scanner.nextInt();

            if (i == 0) {
                first = num;
            }

            if (first == num) {
                TS[i] = 2;
            }
            if (T == num) {
                TS[i] = 1;
                have = true;
            }
        }

        int max = 0;
        int count = 0;
        int or = have ? 1 : 2;
        for (int i = 0; i < N_number; i++) {
            int num = scanner.nextInt();
            if (TS[i] == or && max < num) {
                max = num;
                count = i;
            }
        }

        // 答えを出力

        System.out.println(count + 1);

        // スキャナーを閉じる
        scanner.close();
    }

    // 解答を求めるメソッド
    public static int solve(List<String> strList, int N_number) {
        int ans = 0;
        return ans;
    }
}
