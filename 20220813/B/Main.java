import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 文字列の入力
        int num = 998244353;
        Long dnum = sc.nextLong();
        Long amari = dnum % num;
        if (dnum < 0 && amari != 0) {
            amari = num - Math.abs(amari);
        }

        System.out.println(amari);
    }
}
