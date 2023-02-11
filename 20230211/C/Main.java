import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();
        int M_number = scanner.nextInt();

        // Sを入力

        int count = 0;

        for (int i = 0; i < M_number; i++) {

            Boolean motteru = false;
            int c = scanner.nextInt();
            for (int num = 0; num < c; num++) {

                int check = scanner.nextInt();
                if (N_number == check) {
                    motteru = true;
                    break;
                }
            }

            count = motteru ? count : count++;
        }

        int a = (int) Math.pow(2, count) - 1;
        int all = (int) Math.pow(2, M_number) - 1;
        System.out.println(all - a);
        // スキャナーを閉じる
        scanner.close();
    }

}
