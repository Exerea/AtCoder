import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();

        // 答えを出力
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String ans = str.substring(0, N_number);
        System.out.println(ans);

        // スキャナーを閉じる
        scanner.close();
    }
}
