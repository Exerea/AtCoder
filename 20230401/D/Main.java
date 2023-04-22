import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        Long N_number = scanner.nextLong();
        long call = scanner.nextLong();

        if ((long) N_number * N_number == call) {
            System.out.println(call);
            scanner.close();
            return;
        }

        if ((long) N_number * N_number < call) {
            System.out.println(-1);
            scanner.close();
            return;
        }

        long i = 1;
        long ans = 0;
        while (true) {

            Long gcdnum = gcd(call + i, i);
            if (gcdnum < N_number) {
                ans = call + i;
                break;
            }

            i++;
        }

        // 答えを出力
        System.out.println(ans);

        // スキャナーを閉じる
        scanner.close();
    }

    // 最大公約数を求めるメソッド
    public static Long gcd(Long x, Long y) {
        // ユークリッドの互除法を用いて最大公約数を求める

        while (y != 0) {
            Long r = x % y;
            x = y;
            y = r;
        }
        return x;
    }

}
