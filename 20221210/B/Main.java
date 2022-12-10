import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        // 答えを出力
        String ans = solve(str);
        System.out.println(ans);

        // スキャナーを閉じる
        scanner.close();
    }

    // 解答を求めるメソッド
    public static String solve(String string) {
        // 文字列の長さを取得
        int length = string.length();

        // 最初と最後の文字を抽出
        char first = string.charAt(0);
        char last = string.charAt(length - 1);

        // 最初と最後の文字が大文字かどうかを判定
        boolean firstIsUpper = Character.isUpperCase(first);
        boolean lastIsUpper = Character.isUpperCase(last);

        try {
            int num = Integer.parseInt(string.substring(1, length - 1));
            boolean check = (num >= 100000 && 999999 >= num);
            return firstIsUpper && lastIsUpper && check && length == 8 ? "Yes" : "No";
        } catch (Exception e) {
            return "No";
        }

    }
}
