import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N_City = sc.nextInt();
        int M_road2City = sc.nextInt();

        int[][] nums = new int[N_City][N_City];
        for (int roadLoop = 0; roadLoop < M_road2City; ++roadLoop) {
            int city = sc.nextInt();
            int road = sc.nextInt();

            nums[city - 1][road - 1] = 1;
            nums[road - 1][city - 1] = 1;
        }

        // 街を回す
        for (int cityLoop = 0; cityLoop < N_City; ++cityLoop) {
            ArrayList<Integer> list = new ArrayList<>();

            for (int have2Road = 0; have2Road < N_City; ++have2Road) {
                if (nums[cityLoop][have2Road] == 1) {
                    list.add(have2Road + 1);
                }
            }

            // 出力
            System.out.print(list.size());
            for (Integer i : list) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
        sc.close();

    }
}
