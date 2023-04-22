import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();

        ArrayList<Integer> sayList = new ArrayList<>();
        ArrayList<Integer> rlist = new ArrayList<>();
        ArrayList<Integer> calllist = new ArrayList<>();

        Set<Integer> callList = new HashSet<>();
        for (int i = 1; i <= N_number; i++) {
            Integer call = scanner.nextInt();
            if (!callList.contains(i)) {
                callList.add(call);
            }

        }

        for (int i = 1; i <= N_number; i++) {
            if (!callList.contains(i)) {
                sayList.add(i);
            }
        }

        System.out.println(sayList.size());

        for (Integer i : sayList) {
            System.out.print(i + " ");

        }

        // スキャナーを閉じる
        scanner.close();
    }

}
