import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Nの項目数
        int k = scanner.nextInt(); // Nの項目数
        int d = scanner.nextInt(); // Nの項目数
        // Sを入力
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        // 答えを出力
        int ans = solve(k, d, list);
        System.out.println(ans);

        // スキャナーを閉じる
        scanner.close();
    }

    // 解答を求めるメソッド
    public static int solve(int k, int d, List<Integer> list) {
        int[] hairetu = new int[k];

        List<Long> longs = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                s[i] += a[j];
            }
        }

        for (Long i : longs) {

        }

        int ans = 0;
        return ans;
    }
}
