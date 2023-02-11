import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 答えを出力
        String ans = "No";
        if (a == (b / 2) || a == (b - 1) / 2) {
            ans = "Yes";
        }
        if (b == (a / 2) || b == (a - 1) / 2) {
            ans = "Yes";
        }
        System.out.println(ans);

        // スキャナーを閉じる
        scanner.close();
    }

    // 解答を求めるメソッド
    public static int solve(List<String> strList, int N_number) {
        int ans = 0;
        return ans;
    }
}
