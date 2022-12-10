import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 文字列の入力
        int n = sc.nextInt();
        int x = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int result = 0;
        for (Integer integer = 0; integer < list.size(); ++integer) {
            if (x == list.get(integer)) {
                result = integer + 1;
                break;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
