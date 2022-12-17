import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();
        int M_problem = scanner.nextInt();

        // Sを入力
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < N_number; i++) {
            strList.add(scanner.next());
        }

        // 答えを出力
        int ans = solve(strList, M_problem);
        System.out.println(ans);

        // スキャナーを閉じる
        scanner.close();
    }

    // 解答を求めるメソッド
    public static int solve(List<String> strList, int M_problem) {
        int result = 1;

        int count = 0;
        int a = 0;
        for (int i = 0; i < strList.size() - 1; i++) {
            for (int j = i + 1; j < strList.size(); j++) {

                count = haveX(strList.get(i), strList.get(j)) ? count + 1 : count;
            }
        }

        return count;
    }

    static boolean haveX(String one, String second) {

        for (int k = 0; k < one.length(); k++) {
            String x = String.valueOf(one.charAt(k));
            String y = String.valueOf(second.charAt(k));

            if (x.equals("x") && y.equals("x")) {
                return false;
            }
        }

        return true;
    }
}
