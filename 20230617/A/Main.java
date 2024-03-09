import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        String a = scanner.next();
        String N_number = scanner.next();
        for (int i = 0; i < N_number.length(); i++) {
            System.out.print(N_number.charAt(i));
            System.out.print(N_number.charAt(i));

        }

        // スキャナーを閉じる
        scanner.close();

    }

    // 解答を求めるメソッド
    public static int solve(List<String> strList, int N_number) {
        int ans = 0;
        return ans;
    }
}
