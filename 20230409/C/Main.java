import java.util.*;

import javax.accessibility.AccessibleHyperlink;
import javax.swing.event.SwingPropertyChangeSupport;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int H = scanner.nextInt();
        int W = scanner.nextInt();

        // Sを入力

        List<String> strList = new ArrayList<>();
        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < H; i++) {
            strList.add(scanner.next());
        }

        char[][] charArray = new char[H][W];
        int h = 0;
        for (String string : strList) {

            for (int i = 0; i < W; i++) {
                charArray[h][i] = string.charAt(i);
            }
            h++;
        }

        for (int i = 0; i < H; i++) {
            for (int j = 1; j < W; j++) {
                if (charArray[i][j - 1] == 'T' && charArray[i][j] == 'T') {
                    charArray[i][j - 1] = 'P';
                    charArray[i][j] = 'C';
                }
            }

        }

        for (int i = 0; i < H; i++) {
            String result = new String();
            for (int j = 0; j < W; j++) {
                result += String.valueOf(charArray[i][j]);
            }
            System.out.println(result);
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
