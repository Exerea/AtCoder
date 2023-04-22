import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();

        // Sを入力
        String inputString = scanner.next();
        char[] charArray = inputString.toCharArray();

        int b = -1;
        int af = -1;
        int kome = -1;
        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == '*') {
                kome = i;
            }
            if (charArray[i] == '|') {
                if (b == -1)
                    b = i;
                else
                    af = i;
            }
        }

        if (b < kome && kome < af) {
            System.out.println("in");
        } else {
            System.out.println("out");
        }
        // スキャナーを閉じる
        scanner.close();
    }

    // 解答を求めるメソッド
    public static int solve(List<String> strList, int N_number) {
        int ans = 0;
        return ans;
    }
}
