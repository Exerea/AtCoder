import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static void solve(Long n) {

        ArrayList<Integer> oneDigits = new ArrayList<>();
        for (int digit = 0; digit < 60; ++digit)
            if ((n >> digit & 1L) == 1L)
                oneDigits.add(digit);

        int checkValue = 1 << oneDigits.size();
        for (int val = 0; val < checkValue; ++val) {

            Long result = 0L;
            for (int i = 0; i < oneDigits.size(); ++i) {
                if ((val >> i & 1) == 1) {
                    result = (long) checkValue;
                }
            }

            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        solve(n);
        sc.close();
    }
}