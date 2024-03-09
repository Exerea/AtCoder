import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String str = scanner.next();

        int countT = 0, countA = 0;

        int half = str.length() / 2;
        String saki = new String();
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'T') {
                countT++;
                if (saki.length() == 0 && half == countT) {
                    saki = "T";
                }
            } else {
                countA++;
                if (saki.length() == 0 && half == countA) {
                    saki = "A";
                }
            }
        }

        String ans;
        if (countT > countA) {
            ans = "T";
        } else if (countA > countT) {
            ans = "A";
        } else {
            ans = saki;
        }

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
