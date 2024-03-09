import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Object[] objects = { "A", 3, "B", 1, "C", 4, "D", 1, "E", 5, "F", 9, "G" };

        String[] arr = { scanner.next(), scanner.next() };
        Arrays.sort(arr);

        int distance = 0;
        boolean iscount = false;
        for (Object object : objects) {
            if (Objects.equals(arr[0], object)) {
                iscount = true;
            }

            if (iscount) {
                try {

                    distance += (int) object;
                } catch (Exception e) {

                }

            }
            if (iscount && Objects.equals(arr[1], object)) {
                break;
            }
        }

        // 答えを出力
        int ans = distance;
        System.out.println(ans);

        // スキャナーを閉じる
        scanner.close();
    }

    // 解答を求めるメソッド
    public static int solve(List<String> strList, int N_number) {
        int ans = 0;
        return ans;
    }
}
