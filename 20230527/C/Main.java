import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();
        int M = scanner.nextInt();
        int H = scanner.nextInt();
        int K = scanner.nextInt();

        List<String> strs = new ArrayList<>();

        for (int i = 0; i < N_number; i++) {
            strs.add(scanner.next());
        }

        List<Set<Integer>> heal = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            Set<Integer> set = new HashSet<>();
            Integer x = scanner.nextInt();
            Integer y = scanner.nextInt();

            set.add(x);
            set.add(y);
            heal.add(set);

        }

        int count = 0;
        int nowX = 0, nowY = 0;
        for (int i = 0; i < N_number; i++) {
            String S = strs.get(i);
            if (S.equals("L")) {
                nowX--;
            } else if (S.equals("R")) {
                nowX++;
            } else if (S.equals("U")) {
                nowY++;
            } else {
                nowY--;
            }

            H--;
            count++;

            Set<Integer> set = new HashSet<>();
            set.add(nowX);
            set.add(nowY);
            if (H < K && heal.contains(set)) {
                H = K;
                heal.remove(set);
            }

            if (H < 0) {
                break;
            }

        }

        // 答えを出力
        String ans = count < N_number
                ? "No"
                : "Yes";
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
