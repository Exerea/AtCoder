import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();

        int count = 0;
        for (int i = 1; i < N_number; i++) {
            count += enumerateDivisors(i) * enumerateDivisors(N_number - i);
        }

        System.out.println(count);

        // スキャナーを閉じる
        scanner.close();
    }

    // 整数の約数を列挙する。
    public static Integer enumerateDivisors(int n) {
        // 約数リストを定義する。
        List<Integer> divisors = new ArrayList<>();

        // 1から整数の平方根まで繰り返し処理
        for (int i = 1; i <= n / i; i++) {
            // 整数が現在のiの倍数である場合
            if (n % i == 0) {
                // 約数リストにiを追加する。
                divisors.add(i);

                // iとn/iが異なる場合 : 反対側もリストイン
                if (i != n / i) {
                    // 約数リストにn/iを追加する。
                    divisors.add(n / i);
                }
            }
        }

        // 約数リストを返す。
        return divisors.size();
    }
}
