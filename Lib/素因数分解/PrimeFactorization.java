import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {
    // 素因数分解を行うメソッド
    public static List<Integer> primeFactorization(int n) {
        // 素因数分解した結果を格納するリスト
        List<Integer> primeFactors = new ArrayList<>();

        // 読み込んだ数値を素因数分解する
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }

        // 素因数分解した結果を返す
        return primeFactors;
    }
}