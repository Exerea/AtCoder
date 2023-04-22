import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int n = scanner.nextInt();
        int x = scanner.nextInt();

        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            numSet.add(scanner.nextInt());
        }

        String ans = "No";
        for (int num : numSet) {
            if (numSet.contains(num + x)) {
                ans = "Yes";
                break;
            }
        }

        System.out.println(ans);

        // スキャナーを閉じる
        scanner.close();
    }

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
