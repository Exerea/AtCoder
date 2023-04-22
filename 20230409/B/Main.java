import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();

        // Sを入力
        int b1 = 0;
        int b2 = 0;
        int r1 = 0;
        int r2 = 0;
        int k = 0;

        for (int i = 1; i < 9; i++) {
            char word = string.charAt(i - 1);
            if (word == 'B') {
                if (b1 == 0) {
                    b1 = i;
                } else {
                    b2 = i;
                }
            } else if (word == 'R') {
                if (r1 == 0) {
                    r1 = i;
                } else {
                    r2 = i;
                }
            } else if (word == 'K') {
                k = i;
            }
        }
        scanner.close();
        if ((b1 + b2) % 2 == 1) {
            if (r1 < k && k < r2) {
                System.out.println("Yes");
                return;
            }

        }

        System.out.println("No");

        // スキャナーを閉じる

    }

    // 解答を求めるメソッド
    public static int solve(List<String> strList, int N_number) {
        int ans = 0;
        return ans;
    }
}
