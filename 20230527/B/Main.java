import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();
        int[][] array = new int[N_number][N_number];

        int M = scanner.nextInt();

        for (int i = 0; i < M; i++) {

            int now = scanner.nextInt() - 1;
            for (int w = 1; w < N_number; w++) {
                int next = scanner.nextInt() - 1;
                array[now][next] = 1;
                array[next][now] = 1;
                now = next;
            }

        }
        int count = 0;
        int start = 1;
        for (int i = 0; i < N_number - 1; i++) {
            for (int w = start; w < N_number; w++) {
                if (array[i][w] == 0) {
                    count++;
                }
            }
            start++;
        }

        System.out.println(count);
        // スキャナーを閉じる
        scanner.close();
    }

    // 解答を求めるメソッド
    public static int solve(List<String> strList, int N_number) {
        int ans = 0;
        return ans;
    }
}
