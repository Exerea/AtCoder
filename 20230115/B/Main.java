import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力

        int n = scanner.nextInt();
        String s = scanner.next();

        // 答えを出力
        List<Integer> ans = solve(n, s);

        for (int i : ans) {
            System.out.println(i);
        }

        scanner.close();
    }

    // 解答を求めるメソッド
    public static List<Integer> solve(int n, String s) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < n; i++) {

            int result = 0;

            for (int at = 0; at + i < s.length(); at++) {
                char a = s.charAt(at);
                char b = s.charAt(at + i);

                if (a == b) {
                    break;
                }
                result++;
            }

            list.add(result);

        }

        return list;
    }
}
