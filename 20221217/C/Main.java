import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();

        // Sを入力
        String str = scanner.next();

        String[] words = new String[N_number];
        for (int i = 0; i < str.length(); i++) {
            char word = str.charAt(i);
            words[i] = String.valueOf(word);
        }

        // 答えを出力
        StringBuilder stringBuilder = solve(words);
        System.out.println(stringBuilder);

        // スキャナーを閉じる
        scanner.close();
    }

    // 解答を求めるメソッド
    public static StringBuilder solve(String[] words) {

        StringBuilder stringBuilder = new StringBuilder();
        Boolean ONOFF = true;

        for (int i = 0; i < words.length; i++) {
            String str = String.valueOf(words[i]);
            if (str.equals("\"")) {
                ONOFF = !ONOFF;
            }

            if (str.equals(",")) {
                if (ONOFF) {
                    stringBuilder.append(".");
                } else {
                    stringBuilder.append(str);
                }
            } else {
                stringBuilder.append(str);
            }

        }

        return stringBuilder;
    }
}
