import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 文字列の入力
        String a = sc.next();
        int last = 0;
        for (int i = 0; i < a.length(); i++) {
            String w = String.valueOf(a.charAt(i));
            if (w.equals("a")) {
                last = i + 1;
            }
        }

        if (last == 0) {
            System.out.println(-1);

        } else {
            System.out.println(last);
        }
        sc.close();

    }
}
