import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 文字列の入力
        int num = sc.nextInt();
        int k_counts = sc.nextInt();

        ArrayList<Integer> numList = new ArrayList<>();

        for (int i = 0; i < num; ++i) {
            numList.add(sc.nextInt());
        }

        ArrayList<Integer> resultlList = new ArrayList<>();
        for (int i = 0; i < num; ++i) {
            if (i >= k_counts) {
                resultlList.add(numList.get(i));
            }
        }
        for (int i = 0; i < num; ++i) {
            if (!(i >= k_counts)) {
                resultlList.add(0);
            }
        }

        for (int i : resultlList) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
