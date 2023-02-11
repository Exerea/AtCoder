import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        String N_number = scanner.next();
        String result = new String();

        for (int i = 0; i < N_number.length(); i++) {
            int a = "0".equals(String.valueOf(N_number.charAt(i))) ? 1 : 0;
            result += a;
        }
        System.out.println(result);

        // スキャナーを閉じる
        scanner.close();
    }

}
