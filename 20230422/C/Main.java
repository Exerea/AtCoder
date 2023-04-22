import java.util.*;

import javax.swing.event.ChangeEvent;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();
        String inputString = scanner.next();
        char[] charArray = inputString.toCharArray();

        boolean haveBar = false;
        int max = 0;
        int count = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '-') {
                haveBar = true;
                count = 0;
            } else {
                count++;
                max = max < count ? count : max;
            }

        }

        if (!haveBar || max == 0) {
            max = -1;
        }
        System.out.println(max);

        // スキャナーを閉じる
        scanner.close();
    }

}
