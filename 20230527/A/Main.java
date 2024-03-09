import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N_number = scanner.nextInt();
        String str1 = scanner.next(), str2 = scanner.next();

        boolean tf = true;
        for (int i = 0; i < N_number; i++) {

            char[] array = {
                    str1.charAt(i),
                    str2.charAt(i)
            };

            Arrays.sort(array);

            if (array[0] == array[1]) {
                continue;
            } else if (array[0] == '1' && array[1] == 'l') {
                continue;
            } else if (array[0] == '0' && array[1] == 'o') {
                continue;
            }
            tf = false;
            break;
        }

        String ans = tf
                ? "Yes"
                : "No";
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
