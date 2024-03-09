import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();
        int[] Nums = new int[N_number];

        // Sを入力
        for (int i = 0; i < N_number; i++) {
            Nums[i] = scanner.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N_number - 1; i++) {
            if (Math.abs(Nums[i + 1] - Nums[i]) == 1) {
                list.add(Nums[i]);
                continue;
            } else {
                if (Nums[i + 1] - Nums[i] > 0) {
                    // ++
                    for (int plus = 0; plus < Math.abs(Nums[i + 1] - Nums[i]); ++plus) {
                        list.add(Nums[i] + plus);
                    }

                } else {
                    // --
                    for (int plus = 0; plus < Math.abs(Nums[i + 1] - Nums[i]); ++plus) {
                        list.add(Nums[i] - plus);
                    }
                }
            }
        }
        list.add(Nums[N_number - 1]);

        list.stream().forEach(e -> System.out.print(e + " "));

        // スキャナーを閉じる
        scanner.close();

    }

    // 解答を求めるメソッド
    public static int solve(List<String> strList, int N_number) {
        int ans = 0;
        return ans;
    }
}
