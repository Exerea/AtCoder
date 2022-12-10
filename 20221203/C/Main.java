import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // HとWを入力
        int H = scanner.nextInt();
        int W = scanner.nextInt();

        // Sを入力
        List<String> S = new ArrayList<>();
        for (int i = 0; i < H; i++) {
            S.add(scanner.next());
        }

        // 解答
        int ans = solve(S, H, W);

        // 答えを出力
        System.out.println(ans);

        // スキャナーを閉じる
        scanner.close();
    }

    // 解答を求めるメソッド
    public static int solve(List<String> S, int H, int W) {
        int ans = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (S.get(i).charAt(j) == '#') {
                    ans++;
                }
            }
        }
        return ans;
    }
}
