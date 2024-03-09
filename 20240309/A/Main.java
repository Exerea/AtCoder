import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        String a = scanner.nextLine();
        String b = "";
        boolean tf = false;
        for (int i = 0; i < a.length(); ++i) {
            char moji = a.charAt(i);
            if (moji == '|') {
                tf = !tf;
            }

            if (tf || moji == '|') {
                continue;
            }

            b += moji;
        }

        System.out.println(b);

        // スキャナーを閉じる
        scanner.close();
    }

    // 解答を求めるメソッド
    public static int solve(List<String> strList, int N_number) {
        int ans = 0;
        return ans;
    }
}
