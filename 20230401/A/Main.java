import java.util.*;

import javax.sql.rowset.serial.SerialRef;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        // N：個数 を入力
        String str = scanner.next();

        char dotti = str.charAt(0);
        boolean tf = true;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == dotti) {
                dotti = str.charAt(i);
                tf = false;
                break;
            }
            dotti = str.charAt(i);
        }

        String ans = tf ? "Yes" : "No";
        System.out.println(ans);

        // スキャナーを閉じる
        scanner.close();
    }

}
