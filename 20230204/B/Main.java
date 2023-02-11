import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();
        int k = scanner.nextInt();

        // Sを入力
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            strList.add(scanner.next());
        }
        for (int i = 0; i < N_number - k; i++) {
            scanner.next();
        }
        Collections.sort(strList);

        for (String str : strList) {
            System.out.println(str);
        }

        // スキャナーを閉じる
        scanner.close();
    }

}
