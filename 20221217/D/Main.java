import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();
        int M_num = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < M_num * 2; i++) {
            list.add(scanner.nextInt());
        }

        int[][] field = new int[N_number][N_number];

        System.out.println(ans);

        // スキャナーを閉じる
        scanner.close();
    }

    // 解答を求めるメソッド
    public static int solve(List<String> strList, int N_number) {
        int ans = 0;
        return ans;
    }
}
