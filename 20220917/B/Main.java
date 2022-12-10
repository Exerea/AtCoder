import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 文字列の入力
        String line1 = sc.next();
        String line2 = sc.next();
        String line3 = sc.next();
        String line4 = sc.next();
        String line5 = sc.next();
        String line6 = sc.next();
        String line7 = sc.next();
        String line8 = sc.next();
        String line9 = sc.next();
        String line10 = sc.next();

        String[] list = {
                line1,
                line2,
                line3,
                line4,
                line5,
                line6,
                line7,
                line8,
                line9,
                line10
        };

        int line_i = 0;
        for (String str : list) {

            for (int i = 0; i < str.length(); i++) {
                String word = String.valueOf(str.charAt(i));
                if (word.equals("#")) {
                    if (beginPoint.a == 0) {
                        beginPoint.a = i + 1;
                    }
                    beginPoint.b = i + 1;

                }
            }

            if (str.contains("#")) {
                if (lastPoint.c == 0) {
                    lastPoint.c = line_i + 1;
                }
                lastPoint.d = line_i + 1;

            }

            ++line_i;
        }

        // AB-CD逆っしたｗ
        System.out.println(lastPoint.c + " " + lastPoint.d);
        System.out.println(beginPoint.a + " " + beginPoint.b);
        sc.close();

    }

    // AB-CD逆っしたｗ
    static class beginPoint {
        static int a = 0;
        static int b = 0;
    }

    static class lastPoint {
        static int c = 0;
        static int d = 0;
    }
}
