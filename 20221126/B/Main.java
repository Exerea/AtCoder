import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = solve(sc);
        System.out.println(result);

        sc.close();

    }

    static String solve(Scanner sc) {
        String s_word = sc.next();
        String t_word = sc.next();

        if (s_word.contains(t_word)) {
            return "Yes";
        }

        return "No";
    }
}
