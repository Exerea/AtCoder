import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();

        // 答えを出力
        String ans = solve(scanner, N_number);
        System.out.println(ans);

        // スキャナーを閉じる
        scanner.close();
    }

    // 解答を求めるメソッド
    public static String solve(Scanner scanner, int N_number) {

        int x = N_number;
        int y = N_number;


        String string = scanner.next();
        int coun
        for (int j = 0; j < string.length(); j++) {

        }

        int square[][] = new int[N_number * 2 + 1][N_number * 2 + 1];
        square[x][y] = 1;

        for (int j = 0; j < string.length(); j++) {
            String str = String.valueOf(string.charAt(j));
            if ("R".equals(str)) {
                x++;
            }
            if ("L".equals(str)) {
                x--;
            }
            if ("U".equals(str)) {
                y++;
            }
            if ("D".equals(str)) {
                y--;
            }

            if (square[x][y] == 1) {
                return "Yes";
            }

            square[x][y] = 1;
        }

        return "No";
    }
}
