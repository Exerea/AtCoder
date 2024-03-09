import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();
        int num[][] = new int[N_number + 1][2];

        // Sを入力
        for (int i = 0; i < N_number * 3; i++) {
            int now = scanner.nextInt();
            if (num[now][1] == 1) {
                System.out.print(now + " ");

            }
            num[now][1]++;

        }

        // スキャナーを閉じる
        scanner.close();
    }

}
