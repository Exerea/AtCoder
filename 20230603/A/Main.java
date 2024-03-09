
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        long N_number = scanner.nextLong();

        List<Pair> pairs = new ArrayList<>();

        // Sを入力
        long min = Long.MAX_VALUE;
        ;
        int p = 0;
        for (int i = 0; i < N_number; i++) {
            Pair pair = new Main().new Pair();
            pair.stringValue = scanner.next();
            pair.intValue = scanner.nextInt();

            if (min > pair.intValue) {
                min = pair.intValue;
                p = i;
            }

            pairs.add(pair);
        }

        // 答えを出力

        for (int i = p; i < N_number; i++) {
            System.out.println(pairs.get(i).stringValue);
        }

        for (int i = 0; i < p; i++) {
            System.out.println(pairs.get(i).stringValue);
        }

        // スキャナーを閉じる
        scanner.close();
    }

    public class Pair {
        String stringValue;
        int intValue;
    }
}
