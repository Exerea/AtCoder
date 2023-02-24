import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();
        int M_number = scanner.nextInt();

        // Sを入力
        String str = scanner.next();
        String result = new String();
        for (int i = 0; i < N_number; i++) {
            if (String.valueOf(str.charAt(i)).equals("o") && M_number != 0) {
                result += "o";
                M_number--;
            } else {
                result += "x";
            }

        }

        System.out.println(result);

        // スキャナーを閉じる
        scanner.close();
    }

}
