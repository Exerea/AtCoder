import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();

        // Sを入力
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < N_number; i++) {
            strList.add(scanner.next());
        }

        // 答えを出力
        int ans = solve(strList, N_number);
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
