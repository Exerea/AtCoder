import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();

        // 答えを出力

        List<Long> list = new ArrayList<>();
        for (int i = 0; i < N_number; ++i) {
            list.add(scanner.nextLong() + scanner.nextLong());
        }

        for (long i : list) {
            System.out.println(i);

        }

        // スキャナーを閉じる
        scanner.close();
    }

}
