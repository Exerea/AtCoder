import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.next();
        K = sc.nextInt();
        solve();

        sc.close();
    }

    public static String num = new String();
    public static int K = 0;

    static void solve() {
        if (num.length() < K) {
            System.out.print("0");
        } else {
            ArrayList<String> num_str = create();

            // 出力
            if (num_str.get(num_str.size() - 1).equals("0")) {
                num_str.add("1");
            }

            for (int i = 0; i < num_str.size(); i++) {
                System.out.print(num_str.get(num_str.size() - (1 + i)));
            }
        }
    }

    static ArrayList<String> create() {
        Boolean plusOne = false;
        ArrayList<String> num_str = new ArrayList<>();
        // 5以上なら +
        for (int lengthI = 0; lengthI <= K - 1; lengthI++) {
            Character val = num.charAt(num.length() - (lengthI + 1));
            int number = Character.getNumericValue(val);
            // plus1
            if (plusOne) {
                number++;
            }

            if (number >= 5) {
                plusOne = true;
            } else {
                plusOne = false;
            }
            num_str.add("0");
        }

        for (int nokoriI = K; nokoriI < num.length(); nokoriI++) {
            Character val = num.charAt(num.length() - (nokoriI + 1));
            int number = Character.getNumericValue(val);

            if (plusOne) {
                number++;
                plusOne = false;
            }
            num_str.add(String.valueOf(number));
        }

        return num_str;
    }

}
