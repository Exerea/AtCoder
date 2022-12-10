import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 文字列の入力
        int S_line = sc.nextInt();
        int W_num = sc.nextInt();

        int count = 0;
        for (int i = 0; i < S_line; i++) {
            String word = sc.next();
            for (int j = 0; j < W_num; j++) {
                String moji = String.valueOf(word.charAt(j));
                if (moji.equals("#")) {
                    count++;
                }
            }

        }

        System.out.println(count);

    }
}
