import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // NとDの入力
        int N = scanner.nextInt();
        int D = scanner.nextInt();

        // 人の座標の入力
        int[][] points = new int[N][2];
        for (int i = 0; i < N; i++) {
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }

        // ウイルス感染の判定
        boolean[] infected = new boolean[N];
        infected[0] = true;
        for (int i = 1; i < N; i++) {
            if (calc(points[0], points[i]) <= D) {
                infected[i] = true;
            }
        }

        for (int i = 1; i < N; i++) {
            if (infected[i]) {
                for (int j = 1; j < N; j++) {
                    if (!infected[j] && calc(points[i], points[j]) <= D) {
                        infected[j] = true;
                    }
                }
            }
        }

        // 結果の出力
        for (boolean isInfected : infected) {
            System.out.println(isInfected ? "Yes" : "No");
        }
        scanner.close();
    }

    // 二点間のユークリッド距離を計算するメソッド
    private static double calc(int[] point1, int[] point2) {
        int dx = point1[0] - point2[0];
        int dy = point1[1] - point2[1];
        return Math.sqrt(dx * dx + dy * dy);
    }
}
