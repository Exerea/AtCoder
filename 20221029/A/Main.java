import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
            if (max < num) {
                max = num;
            }
        }

        int here = 0;
        for (int loop = 0; loop < list.size(); loop++) {
            if (list.get(loop) == max) {
                here = loop + 1;
                break;
            }
        }

        System.out.println(here);
    }
}
