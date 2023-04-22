import java.util.*;

import javax.swing.text.Position;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int[][] point = new int[h][w];
        String AtoZ = ".ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < h; i++) {

            String str = new String();
            for (int j = 0; j < w; j++) {
                str += String.valueOf(AtoZ.charAt(scanner.nextInt()));
            }
            System.out.println(str);
        }

        // スキャナーを閉じる
        scanner.close();
    }

}
