import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();
        int Q_number = scanner.nextInt();

        Map<Integer, Integer> sensyu = new HashMap<>();
        for (int i = 1; i <= N_number; ++i) {
            sensyu.put(i, 0);
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < Q_number; ++i) {
            int type = scanner.nextInt();
            int player = scanner.nextInt();

            if (type == 1)
                sensyu.replace(player, sensyu.get(player) + 1);
            else if (type == 2)
                sensyu.replace(player, sensyu.get(player) + 2);
            else {
                if (sensyu.get(player) < 2) {
                    list.add("No");
                } else {
                    list.add("Yes");

                }
            }
        }

        for (String i : list) {
            System.out.println(i);
        }

        // スキャナーを閉じる
        scanner.close();
    }

}
