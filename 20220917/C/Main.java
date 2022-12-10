import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        sc.close();

        List<Integer> oneDigits = OneDigits(n);

        List<Integer> results = Check(n, oneDigits);

        // 結果出力
        System.out.println("0");
        for (int result : results) {
            System.out.println(result);
        }

    }

    // "1"を持つ桁数をリスト化
    static List<Integer> OneDigits(BigInteger n) {
        List<Integer> resultList = new ArrayList<>();

        String binN = n.to(n);
        binN = String.format("%60s", binN).replace(" ", "0");
        for (int str_i = 0; str_i < binN.length(); str_i++) {
            String word = String.valueOf(binN.charAt(str_i));

            if (word.equals("1")) {
                resultList.add(str_i);
            } else {
                NotOneDigits.add(str_i);
            }
        }

        return resultList;
    }

    static List<Integer> NotOneDigits = new ArrayList<>();

    // チェック
    static List<Integer> Check(int n, List<Integer> OneDigits) {

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            String binI = Integer.toBinaryString(i);
            binI = String.format("%60s", binI).replace(" ", "0");

            boolean flag = false;

            for (int str_i = 0; str_i < binI.length(); str_i++) {

                String word = String.valueOf(binI.charAt(str_i));

                if (word.equals("1")) {

                    if (OneDigits.contains(str_i)) {
                        flag = true;
                    } else if (NotOneDigits.contains(str_i)) {
                        flag = false;
                        break;
                    }

                }
            }

            if (flag) {
                resultList.add(i);
            }

        }
        return resultList;
    }

}
