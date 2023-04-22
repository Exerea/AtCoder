import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        Long A = scanner.nextLong(), B = scanner.nextLong();
        if (A.equals(B)) {
            System.out.println(0);
            return;
        }

        Long big = A > B ? A : B;
        Long small = A > B ? B : A;

        Long count = big / small;
        count += small - 1;

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
