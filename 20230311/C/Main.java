import java.util.*;
import java.awt.Point;

public class Main {
    static char[][] map;
    static int[][] d;
    static int startX, startY, goalX, goalY;
    static Deque<Point> queue = new ArrayDeque<>();
    static int[] dx = new int[] { 1, 0 };
    static int[] dy = new int[] { 0, 1 };
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(), W = sc.nextInt();
        startX = sc.nextInt() - 1;
        startY = sc.nextInt() - 1;
        goalX = sc.nextInt() - 1;
        goalY = sc.nextInt() - 1;
        map = new char[H][W];
        for (int i = 0; i < H; i++) {
            map[i] = sc.next().toCharArray();
            queue.add(new Point(startX, startY));
        }

        System.out.println(bfs());
        sc.close();
    }

    static int bfs(Integer rootCount) {
        for (int time = 0; time < rootCount; count++) {

            ArrayList<char[][]> callList = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                Point point = queue.poll();
                if (point.x == goalX && point.y == goalY) {
                    count++;
                }
                for (int j = 0; j < 4; j++) {
                    if (!callList.contains(map[point.x + dx[j]][point.y + dy[j]])) {

                        queue.add(new Point(point.x + dx[j], point.y + dy[j]));
                    }
                }
            }
        }
    }
}
