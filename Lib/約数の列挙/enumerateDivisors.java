import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class enumerateDivisors {

    // 整数の約数を列挙する。
    public static List<Integer> enumerateDivisors(int n) {
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

        // 約数リストを昇順に並べ替える。
        Collections.sort(divisors);

        // 約数リストを返す。
        return divisors;
    }
}
