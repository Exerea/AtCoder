import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        String a = scanner.next();

        // 答えを出力
        Long ans = solve(a);
        System.out.println(ans);

        // スキャナーを閉じる
        scanner.close();
    }

    // 解答を求めるメソッド
    public static Long solve(String word) {

        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Long ans = 0L;
        for (int i = 0; i < word.length(); i++) {

            char index = word.charAt(i);
            int indexI = 1;

            for (int j = 0; j < alpha.length(); j++) {
                if (alpha.charAt(j) == index) {
                    indexI = j + 1;
                    break;
                }
            }

            double result = Math.pow(26, word.length() - 1 - i);
            Long aaa = (long) (result * indexI);
            ans = ans + aaa;
        }

        return ans;
    }
}
