import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 文字列の入力
        String word = sc.next();
        Integer midNum = word.length() / 2;
        char midWord = word.charAt(midNum);
        System.out.println(midWord);

    }
}
