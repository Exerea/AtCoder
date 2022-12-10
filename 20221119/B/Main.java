import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 文字列の入力
        String str1 = String.format("%02d", sc.nextInt());
        String str2 = String.format("%02d", sc.nextInt());

        int A = Integer.valueOf(String.valueOf(str1.charAt(0)));
        int B = Integer.valueOf(String.valueOf(str1.charAt(1)));
        int C = Integer.valueOf(String.valueOf(str2.charAt(0)));
        int D = Integer.valueOf(String.valueOf(str2.charAt(1)));

        while (!isMimachigae(A, B, C, D)) {
            int AB = A * 10 + B;
            int CD = C * 10 + D;
            if (CD + 1 == 60) {
                C = 0;
                D = 0;

                if (AB + 1 == 24) {
                    A = 0;
                    B = 0;
                } else {
                    AB += 1;
                    A = (AB - (AB % 10)) / 10;
                    B = AB % 10;
                }

            } else {
                CD += 1;
                C = (CD - (CD % 10)) / 10;
                D = CD % 10;
            }
        }

        System.out.println(A + "" + B + " " + C + "" + D);
        sc.close();

    }

    static Boolean isMimachigae(int A, int B, int C, int D) {

        int AC = A * 10 + C;
        int BD = B * 10 + D;

        if (AC < 24 && BD < 59) {
            return true;
        }
        return false;
    }
}
