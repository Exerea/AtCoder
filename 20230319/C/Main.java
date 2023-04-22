import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();
        int M_number = scanner.nextInt();

        // Sを入力
        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();

        for (int i = 0; i < N_number; i++) {
            aList.add(scanner.nextInt());
        }
        for (int i = 0; i < M_number; i++) {
            bList.add(scanner.nextInt());
        }

        List<Integer> aListresult = new ArrayList<>();
        List<Integer> bListresult = new ArrayList<>();

        int acount = 0, bcount = 0;
        int max = aList.size() + bList.size();

        int aValue = 0;
        int bValue = 0;
        for (int i = 1; i <= max; i++) {

            try {
                aValue = aList.get(acount);
            } catch (Exception e) {
                bListresult.add(i);
                bcount++;
                continue;
            }
            try {
                bValue = bList.get(bcount);
            } catch (Exception e) {
                aListresult.add(i);
                acount++;
                continue;
            }

            if (aValue < bValue) {
                aListresult.add(i);
                acount++;

            } else {
                bListresult.add(i);
                bcount++;
            }
        }

        for (int i : aListresult) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : bListresult) {
            System.out.print(i + " ");
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
