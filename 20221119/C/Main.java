import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 文字列の入力
        int n_user = sc.nextInt();
        int q_action = sc.nextInt();

        int[][] map = new int[n_user][n_user];

        for (String str : messageArrayList(sc, q_action, map)) {
            System.out.println(str);
        }

        sc.close();

    }

    static ArrayList<String> messageArrayList(Scanner sc, int q_action, int[][] map) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < q_action; i++) {
            int action = sc.nextInt();
            int user = sc.nextInt() - 1;
            int against = sc.nextInt() - 1;

            if (action == 1) {
                map[user][against] = 1;
            } else if (action == 2) {
                map[user][against] = 0;
            } else {
                if (map[user][against] == 1 && map[against][user] == 1) {
                    list.add("Yes");
                } else {
                    list.add("No");
                }
            }
        }

        return list;
    }
}
