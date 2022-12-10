import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = solve(sc);
        System.out.println(result);

        sc.close();

    }

    static int solve(Scanner sc) {
        String s_word = sc.next();

        int count_V = 0;
        int count_W = 0;

        for (int i = 0; i < s_word.length(); i++) {
            String check = String.valueOf(s_word.charAt(i));
            if (check.equals("v")) {
                count_V += 1;
            } else {
                count_W += 2;
            }
        }

        return count_V + count_W;
    }
}
