import java.time.Year;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        char[][] grid = new char[H][W];

        // 格納
        for (int i = 0; i < H; i++) {
            String row = scanner.next();
            for (int j = 0; j < W; j++) {
                grid[i][j] = row.charAt(j);
            }
        }

        int a = -1, b = -1, c = -1, d = -1;

        int Xmin = Integer.MAX_VALUE, Xmax = Integer.MIN_VALUE;
        int Ymin = Integer.MAX_VALUE, Ymax = Integer.MIN_VALUE;

        // 元々置かれていたクッキーの範囲を特定する
        for (int h = 0; h < H; h++) {
            for (int w = 0; w < W; w++) {
                if (grid[h][w] == '#') {
                    if (Xmin > h) {
                        Xmin = h;
                    }

                    if (Xmax < h) {
                        Xmax = h;
                    }

                    if (Ymin > w) {
                        Ymin = w;
                    }

                    if (Ymax < w) {
                        Ymax = w;
                    }
                }
            }
        }

        // すぬけ君が食べたクッキーの座標を特定する
        int eatenRow = 0, eatenCol = 0;
        for (int i = Xmin; i <= Xmax; i++) {
            for (int j = Ymin; j <= Ymax; j++) {
                if (grid[i][j] == '.') {
                    eatenRow = i + 1;
                    eatenCol = j + 1;
                }
            }
        }

        System.out.println(eatenRow + " " + eatenCol);

        scanner.close();
    }
}
