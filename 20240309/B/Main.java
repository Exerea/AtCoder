import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        while (true) {

            int num = scanner.nextInt();

            if (num != 0) {

                stack.push(num);

            } else {
                stack.push(num);

                break;
            }
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // スキャナーを閉じる
        scanner.close();

    }

    // 解答を求めるメソッド
    public static int solve(List<String> strList, int N_number) {
        int ans = 0;
        return ans;
    }
}
