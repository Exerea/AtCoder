import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();
        int K_number = scanner.nextInt();

        // Sを入力

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N_number; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);

        // 答えを出力

        int mex = 0;
        for (int i = 0; i < K_number || i < list.size(); ++i) {
            if (mex < K_number && mex == list.get(i)) {
                ++mex;
            }
        }

        System.out.println(mex);

        // スキャナーを閉じる
        scanner.close();
    }

}
