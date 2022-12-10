import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N_num = sc.nextInt();

        // Listに入れる
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < N_num; i++) {
            list.add(sc.nextLong());
        }

        // 追加を求める
        Long nowSum = list.get(0);
        ArrayList<Long> results = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            Long nextValue = list.get(i + 1);
            Long addition = nextValue - nowSum;
            nowSum = nowSum + addition;
            results.add(addition);
        }

        // 出力
        System.out.print(list.get(0));
        for (Long result : results) {
            System.out.print(" " + result);
        }

        sc.close();

    }

}
