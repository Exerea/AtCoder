import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 文字列の入力
        Integer a = sc.nextInt();

        String hex = a.toHexString(a);
        hex = hex.format("%2s", hex).replace(" ", "0");
        hex = hex.toUpperCase();
        System.out.println(hex);
    }
}
