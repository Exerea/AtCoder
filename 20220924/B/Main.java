import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 文字列の入力
        int x_goal = sc.nextInt();
        int y_wall = sc.nextInt();
        int z_hammmer = sc.nextInt();

        Boolean end = false;
        if (x_goal > 0) {
            if (0 > y_wall || (y_wall > 0 && y_wall > x_goal)) {
                System.out.println(x_goal);
                end = true;
            }
        }

        if (x_goal < 0) {
            if (0 < y_wall || (y_wall < 0 && y_wall < x_goal)) {
                System.out.println(Math.abs(x_goal));
                end = true;
            }
        }

        // ここから考える
        if (!end) {
            int[] points = { x_goal, y_wall, z_hammmer };
            Arrays.sort(points);

            Boolean tf = false;
            if (points[0] == x_goal) {

                if (points[1] == y_wall) {
                    tf = true;
                }
            }
            if (points[0] == z_hammmer) {
                if (points[1] == y_wall) {
                    tf = true;
                }
            }

            if (tf) {
                System.out.println(resultLength(x_goal, z_hammmer));
            } else {
                System.out.println(-1);
            }
        }
        sc.close();

    }

    static public int resultLength(int x_goal, int z_hammmer) {
        int result = 0;
        if (x_goal > 0) {
            if (0 > z_hammmer) {
                result = Math.abs(x_goal) + Math.abs(z_hammmer) * 2;
            } else {
                result = Math.abs(x_goal);
            }
        } else {
            if (z_hammmer > 0) {
                result = Math.abs(x_goal) + z_hammmer * 2;
            } else {
                result = Math.abs(x_goal);
            }
        }
        return result;
    }
}
