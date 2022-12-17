public class GreatestCommonDivisor {
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