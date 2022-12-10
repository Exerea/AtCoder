import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();
        Long T_time = scanner.nextLong();

        // Sを入力
        List<Integer> A_timeList = new ArrayList<>();
        for (int i = 0; i < N_number; i++) {
            A_timeList.add(scanner.nextInt());
        }

        // 答えを出力
        int[] ans = solve(A_timeList, T_time);
        System.out.println(ans[0] + " " + ans[1]);

        // スキャナーを閉じる
        scanner.close();
    }

    // 解答を求めるメソッド
    public static int[] solve(List<Integer> timeList, Long T_time) {

        Long max = 0L;
        for (Integer integer : timeList) {
            Long long1 = integer.longValue();
            max = max + long1;
        }
        T_time %= max;

        // 曲の番号と再生後の秒数を算出
        long sum = 0;

        int i = 0;
        while (T_time > sum + timeList.get(i)) {
            sum += timeList.get(i);
            i = i + 1 < timeList.size() ? i + 1 : 0;
        }

        int ans = i + 1;
        int amari = (int) (T_time - sum);
        int[] a = { ans, amari };
        return a;
    }
}
