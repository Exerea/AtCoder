import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力

        long N_number = scanner.nextLong();

        String str = String.valueOf(N_number);
        int max = str.length() - 3;
        for (int i = 0; i < max; i++) {
            N_number /= 10;
        }

        for (int i = 0; i < max; i++) {
            N_number *= 10;
        }

        System.out.println(N_number);
        // スキャナーを閉じる
        scanner.close();
    }

}
