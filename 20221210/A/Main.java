import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N：個数 を入力する
        int N = sc.nextInt();

        for (int i = N; i >= 0; i--) {
            System.out.println(i);
        }
        sc.close();
    }

}
