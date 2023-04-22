import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();
        int D = scanner.nextInt();

        if (N_number < 2) {
            System.out.println(-1);
            return;
        }

        // Sを入力

        int x = scanner.nextInt(), y = scanner.nextInt();
        for (int i = 2; i < N_number; i++) {

            if (y - x <= D) {
                System.out.println(y);
                return;
            }
            x = y;
            y = scanner.nextInt();

        }

        System.out.println(-1);

        // スキャナーを閉じる
        scanner.close();
    }

}
