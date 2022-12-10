import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Long[][] view = new Long[n][n];

        // 入れる
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int[] roap = { sc.nextInt(), sc.nextInt() };
            list.add(roap);
        }

        //
        Queue queue = new Queue<E>() {

        };
        queue.add(1);

        for (int[] listData : list) {
            if (Arrays.asList(listData).contains(listData[0])) {
                Queue.add(listData[1]);
            }
            if (Arrays.asList(listData).contains(listData[1])) {
                Queue.add(listData[0]);
            }
        }
        Queue = Queue.distinct();

        sc.close();
    }

}
