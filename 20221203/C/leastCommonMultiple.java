
public class leastCommonMultiple {

    // 2つの整数の最小公倍数を求める。
    public static int leastCommonMultiple(int a, int b) {
        // 2つの整数の最大公約数を求める。
        int gcd = gcd(a, b);

        // 最小公倍数を計算する。
        int lcm = a * b / gcd;

        // 最小公倍数を返す。
        return lcm;
    }

    // 最大公約数を求めるメソッド
    public static int gcd(int x, int y) {
        // ユークリッドの互除法を用いて最大公約数を求める
        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
}
