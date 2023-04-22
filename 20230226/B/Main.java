import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();

        // Sを入力
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < 5 * N_number; i++) {
            list.add(scanner.nextDouble());
        }

        // 答えを出力
        Collections.sort(list);

        Double sum = 0.0000;
        for (int i = N_number; i < list.size() - N_number; i++) {
            sum += list.get(i);
        }

        int divi = list.size() - 2 * N_number;
        Double ans = (double) (sum / divi);
        System.out.println(ans);

        // スキャナーを閉じる
        scanner.close();
    }

}
