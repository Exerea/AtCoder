import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 文字列の入力
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        String[] str1 = { "H", "D", "C", "S" };
        String[] str2 = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K" };

        Boolean check = true;

        for (String str : list) {

            String first = String.valueOf(str.charAt(0));
            if (!Arrays.asList(str1).contains(first)) {
                check = false;
                break;
            }

            String secondString = String.valueOf(str.charAt(1));
            if (!Arrays.asList(str2).contains(secondString)) {
                check = false;
                break;
            }

            if (first == secondString) {
                check = false;
                break;
            }

        }

        Set<String> set = new HashSet<>(list);
        if (set.size() != list.size()) {
            check = false;
        }

        String result = (check) ? "Yes" : "No";
        System.out.println(result);

        sc.close();
    }

}
