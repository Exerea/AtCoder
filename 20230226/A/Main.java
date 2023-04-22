import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        String N_number = scanner.next();
        String lowN = N_number.toLowerCase();

        int ans = 0;
        for (int i = 0; i < N_number.length(); i++) {
            if (N_number.charAt(i) != lowN.charAt(i)) {
                ans = i + 1;
                break;
            }
        }

        System.out.println(ans);

        // スキャナーを閉じる
        scanner.close();
    }

}
