import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();
        int M = scanner.nextInt();

        // Sを入力
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N_number; i++) {
            list.add(scanner.nextInt());
        }

        // 答えを出力

        int sum = 0;
        for (int i = 0; i < M; ++i) {
            sum += list.get(scanner.nextInt() - 1);
        }
        System.out.println(sum);

        // スキャナーを閉じる
        scanner.close();
    }

}
