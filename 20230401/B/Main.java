import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        ArrayList<String> panel = new ArrayList<>();

        int x = 0, y = 0;
        for (int i = 0; i < 8; i++) {
            String in = scanner.next();

            if (in.contains("*")) {
                for (int j = 0; j < in.length(); j++) {
                    char kome = in.charAt(j);
                    if (kome == '*') {
                        x = j;
                    }
                }
                y = 8 - i;
            }
        }

        String AtoZ = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();

        String ans = String.valueOf(AtoZ.charAt(x)) + (y);
        System.out.println(ans);
        // スキャナーを閉じる
        scanner.close();
    }

}
