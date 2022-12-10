import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 文字列の入力
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = sc.nextBigInteger();
        BigInteger d = sc.nextBigInteger();
        BigInteger e = sc.nextBigInteger();
        BigInteger f = sc.nextBigInteger();

        BigInteger ab = (a.multiply(b));
        BigInteger abc = ab.multiply(c);
        BigInteger de = (d.multiply(e));
        BigInteger def = de.multiply(f);

        BigInteger sa = abc.subtract(def);

        Integer ss = 998244353;
        BigInteger sss = BigInteger.valueOf(ss);
        BigInteger ans = sa.remainder(sss);

        System.out.println(ans);
        sc.close();
    }

}
