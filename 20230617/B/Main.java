import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger now = BigInteger.ZERO;
        for (int i = 0; i < 64; i++) {
            int call = scanner.nextInt();

            if (call == 1) {
                now = now.add(BigInteger.ONE.shiftLeft(i));
            }
        }

        System.out.println(now);

        // スキャナーを閉じる
        scanner.close();
    }

}
