import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 文字列の入力
        Scanner sc = new Scanner(System.in);
        int T_caseNum = sc.nextInt();

        int caseI = 0;
        while (caseI < T_caseNum) {
            int N_strLength = sc.nextInt();
            int K_1Count = sc.nextInt();
            String str = sc.next();

            results.add(solve(N_strLength,
                    K_1Count, str));

            caseI = caseI + 1;
        }

        // 結果発表
        for (String result : results) {
            System.out.println(result);
        }

        sc.close();
    }

    public static ArrayList<String> results = new ArrayList<>();

    public static String solve(int N_strLength,
            int K_1Count, String str) {
        // 文字列の入力

        int count = 0;

        // 部分を作って回る
        for (int areaI = 0; areaI < N_strLength - K_1Count + 1; areaI++) {
            String area = str.substring(areaI, areaI + K_1Count);
            if (!area.contains("0")) {
                count++;
            }
        }

        // 1回ならGOGOGO
        if (count == 1) {
            return "YES";
        } else {
            return "NO";
        }

    }

}
